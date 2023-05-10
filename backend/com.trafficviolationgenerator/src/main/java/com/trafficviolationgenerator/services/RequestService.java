package com.trafficviolationgenerator.services;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;


public class RequestService {

    private static final String POST_API_URL = "http://localhost:8080/violations";

   public static void generateRequest(String data){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bear 12345");

        HttpEntity entity = new HttpEntity(data, headers);
        RestTemplate restTemplate = new RestTemplate();
        Object res = restTemplate.exchange(POST_API_URL, HttpMethod.POST, entity, Object.class);
        System.out.println(res);
    }

}
