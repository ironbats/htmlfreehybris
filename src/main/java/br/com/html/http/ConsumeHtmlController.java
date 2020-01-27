package br.com.html.http;

import br.com.html.service.HybrisRetrievePageService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class ConsumeHtmlController {

    @Autowired
    private HybrisRetrievePageService hybrisRetrievePageService;


    @GetMapping("/{pageId}")
    public String consumeHtml(@PathVariable String pageId) {

        return hybrisRetrievePageService.getPageHtmlHybris(pageId);

    }
}
