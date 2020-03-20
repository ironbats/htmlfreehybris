package br.com.html.service;

import br.com.html.auth.HybrisOauthToken;
import br.com.html.domain.Component;
import br.com.html.dto.CustomerDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
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

        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + hybrisOauthToken.getToken().getAccessToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("Content-Type", "multipart/form-data");
        headers.addAll(multiValueMap);

        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        converters.add(new MappingJackson2HttpMessageConverter());
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
        converters.add(new StringHttpMessageConverter());
        converters.add(new FormHttpMessageConverter());
        converters.add(new ResourceHttpMessageConverter());
        restTemplate.setMessageConverters(converters);

        ResponseEntity<String> response = null;


        List<String> tempFileNames = new ArrayList<>();
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        String tempFileName = null;
        FileOutputStream fo;

        try {

            for (MultipartFile f : file) {
                tempFileName = "/tmp/" + f.getOriginalFilename();
                tempFileNames.add(tempFileName);
                fo = new FileOutputStream(tempFileName);
                fo.write(tempFileName.getBytes());
                fo.close();
                params.add("file", new FileSystemResource(tempFileName));
            }


            String url = "https://localhost:9002/makrocommercewebservices/v2/makro-co/customer/step4";
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonInString = objectMapper.writeValueAsString(customerDTO);
            params.add("customerJson", jsonInString);
            restTemplate.postForObject(url, new HttpEntity<>(params, headers), Map.class);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }
}
