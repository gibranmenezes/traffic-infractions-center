package com.trafficviolationgenerator.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.trafficviolationgenerator.model.TrafficViolation;


import java.time.format.DateTimeFormatter;

public class Converter {
    private static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    public static String convertObjectToJson(TrafficViolation violation){
        Gson gson = new Gson();
        String json = gson.toJson(violation);

       return json;
    }

}
