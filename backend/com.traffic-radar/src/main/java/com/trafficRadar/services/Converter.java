package com.trafficRadar.services;

import com.google.gson.Gson;
import com.trafficRadar.model.TrafficViolationData;


import java.time.format.DateTimeFormatter;

public class Converter {
    private static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    public static String convertObjectToJson(TrafficViolationData violation){
        Gson gson = new Gson();
        String json = gson.toJson(violation);

       return json;
    }

}
