package br.com.html.http;

import br.com.html.dto.CustomerDTO;
import br.com.html.service.HybrisRetrievePageService;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/register")
public class ConsumeHtmlController {

    @Autowired
    private HybrisRetrievePageService hybrisRetrievePageService;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{pageId}")
    public String consumeHtml(@PathVariable String pageId) {

        return hybrisRetrievePageService.getPageHtmlHybris(pageId);

    }

    @PostMapping(value = "/customer", consumes = "multipart/form-data")
    public ResponseEntity<?> create(@RequestParam MultipartFile file[],
                                    @RequestParam String userDto) {

        ObjectMapper objectMapper = new ObjectMapper();
        CustomerDTO customerDTO1 = new CustomerDTO();

        try {

            customerDTO1 = objectMapper.readValue(userDto, CustomerDTO.class);
            hybrisRetrievePageService.sendValuesToHybris(file, customerDTO1);
            System.out.println(customerDTO1);
        } catch (Exception cause) {
            System.out.println("error with your json");
        }


        return ResponseEntity.ok("OK");
    }

}
