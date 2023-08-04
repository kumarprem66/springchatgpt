package com.masaigai.springchatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.PrimitiveIterator;

public class ApiClient {

//    @Qualifier("openaiRestTemplate")
//    @Autowired
//    private RestTemplate restTemplate;
////    @Value("${openai.api.url}")
//    private String comUrl = "http://localhost:8080/chat";
//
//
//    public String callApi(String prompt){
//        String completeUrl = comUrl+"?prompt="+prompt;
//        return restTemplate.getForObject(completeUrl,String.class);
//    }

}
