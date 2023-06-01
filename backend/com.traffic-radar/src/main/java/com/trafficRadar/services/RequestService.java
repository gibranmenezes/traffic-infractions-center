package com.trafficRadar.services;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RequestService {

    private static final String POST_API_URL = "http://localhost:8080/violations";

   public void generateRequest(String data){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bear 12345");

        HttpEntity entity = new HttpEntity(data, headers);
        RestTemplate restTemplate = new RestTemplate();
        Object res = restTemplate.exchange(POST_API_URL, HttpMethod.POST, entity, Object.class);
        System.out.println(res);
    }

}
