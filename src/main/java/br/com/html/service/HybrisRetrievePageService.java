package br.com.html.service;

import br.com.html.auth.HybrisOauthToken;
import br.com.html.domain.Component;
import br.com.html.dto.CustomerDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.*;

@Service
public class HybrisRetrievePageService {

    @Autowired
    private HybrisOauthToken hybrisOauthToken;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hybris.url.component.page}")
    private String urlPage;

    @Value("${hybris.url.component.complement}")
    private String urlPageComplement;
    
    private static final String PATH ="/home/themarkiron/Desktop/MAKRO_SAVE_FILES/arquivoinicio/";
    private static final String URL = "https://localhost:9002/makrocommercewebservices/v2/makro-co/customer/step4";

    public String getPageHtmlHybris(String pageId) {

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", hybrisOauthToken.getToken().getAccessToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Component> httpEntity = restTemplate.exchange(urlPage + pageId + urlPageComplement, HttpMethod.GET,
                new HttpEntity<>(headers), Component.class);

        return httpEntity.getBody().getContent();

    }


    public String sendValuesToHybris(MultipartFile[] file, CustomerDTO customerDTO) throws IOException {

        ResponseEntity responseEntity = null;

        try {

            for(int i =0; i  < file.length;i++) {
                byte[] bytes = file[i].getBytes();
                String path = PATH+file[i].getOriginalFilename();
                File fileToSave = new File(path);
                FileCopyUtils.copy(bytes, fileToSave);
            }


            responseEntity  =  sendFiletoHybris(file, URL, customerDTO);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseEntity.toString();
    }

    public ResponseEntity sendFiletoHybris(MultipartFile[] file, String url, CustomerDTO customerDTO) throws JsonProcessingException {

        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + hybrisOauthToken.getToken().getAccessToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("Content-Type", "multipart/form-data");
        headers.addAll(multiValueMap);

        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();


        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writeValueAsString(customerDTO);
        params.add("customerJson", jsonInString);

        File f = null;

        for(MultipartFile multipartFile : file)
        {
            f = new File(PATH + multipartFile.getOriginalFilename());
            final FileSystemResource fsr = new FileSystemResource(f.getPath());
            params.add("file", fsr);
        }

        params.add("customerJson", customerDTO);

        final HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(new LinkedMultiValueMap<String, Object>(), headers);
        requestEntity.getBody().addAll(params);

        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
    }


}
