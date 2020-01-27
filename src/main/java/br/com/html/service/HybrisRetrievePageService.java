package br.com.html.service;

import br.com.html.auth.HybrisOauthToken;
import br.com.html.domain.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

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


}
