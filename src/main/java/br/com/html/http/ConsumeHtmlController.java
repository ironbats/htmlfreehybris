package br.com.html.http;

import br.com.html.dto.CustomerDTO;
import br.com.html.service.HybrisRetrievePageService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;



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
