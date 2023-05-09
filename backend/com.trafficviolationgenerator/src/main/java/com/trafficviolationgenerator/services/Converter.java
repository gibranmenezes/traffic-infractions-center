package com.trafficviolationgenerator.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trafficviolationgenerator.model.TrafficViolation;

import java.time.format.DateTimeFormatter;

public class Converter {

    private static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    public static String convertObjectToJson(TrafficViolation violation){

        StringBuilder sb = new StringBuilder();
        sb.append("{"+ "\n");
        sb.append("\"moment\""  + ": ");
        sb.append("\"" + violation.getMoment().format(DTF) + "\"" + ", \n");
        sb.append("\"velocity\""  + ": ");
        sb.append(violation.getVelocity() + ", \n");
        sb.append("\"licensePlate\""  + ": ");
        sb.append("\"" + violation.getLicensePlate() + "\"" + ",\n");
        sb.append("\"vehicleClass\""  + ": ");
        sb.append("\"" + violation.getVehicleClass() + "\"" + "\n");
        sb.append("}");

        return sb.toString();

    }
}
