package com.masaigai.springchatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {


    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @GetMapping("/chat")
   public String chat(@RequestParam String prompt){
       ChatRequest request = new ChatRequest(model,prompt,10);

       ChatResponse response = restTemplate.postForObject(apiUrl
               ,request,ChatResponse.class);
       if(response == null || response.getChoices() == null){
           return "No response";
       }
       return response.getChoices().get(0).getMessage().getContent();
   }



}
