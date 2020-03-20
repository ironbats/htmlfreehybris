package br.com.html.service;

import br.com.html.auth.HybrisOauthToken;
import br.com.html.domain.Component;
import br.com.html.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public String getPageHtmlHybris(String pageId) {

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", hybrisOauthToken.getToken().getAccessToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Component> httpEntity = restTemplate.exchange(urlPage+pageId+urlPageComplement, HttpMethod.GET,
                new HttpEntity<>(headers), Component.class);

        return httpEntity.getBody().getContent();

    }

    public String sendValuesToHybris(MultipartFile [] file , CustomerDTO customerDTO ) {

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", hybrisOauthToken.getToken().getAccessToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        ResponseEntity<String> response = null;



        List<String> tempFileNames = new ArrayList<>();
        LinkedMultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        String tempFileName = null;
        FileOutputStream fo;

        try {

            for(MultipartFile f : file) {
                tempFileName = "/tmp/" + f.getOriginalFilename();
                tempFileNames.add(tempFileName);
                fo = new FileOutputStream(tempFileName);
                fo.write(tempFileName.getBytes());
                fo.close();
                params.add("file", new FileSystemResource(tempFileName));
            }

            String url = "https://localhost:9002/makrocommercewebservices/v2/makro-co/customer/step4";

            params.add("customerJson", customerDTO);
            HttpEntity requestEntity = new HttpEntity<>(params, headers);
            response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }
}
