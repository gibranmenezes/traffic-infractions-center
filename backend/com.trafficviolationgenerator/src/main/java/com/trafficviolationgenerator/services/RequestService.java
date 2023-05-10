package com.trafficviolationgenerator.services;


import com.sun.net.httpserver.Headers;
import org.springframework.web.servlet.function.ServerRequest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.net.http.HttpResponse.BodySubscribers.discarding;


public class RequestService {

    private static final String POST_API_URL = "http://localhost:8080/violations";

    private static final Long TIMEOUT = 4L;

    public static void generateRequest(String data) throws URISyntaxException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(data))
                .header("accept", "application/json")
                .uri(URI.create(POST_API_URL))
                .timeout(Duration.ofSeconds(TIMEOUT))
                .build();


        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .thenApply(HttpResponse::body)
                        .thenAccept(System.out::println)
                        .join();


    }




}
