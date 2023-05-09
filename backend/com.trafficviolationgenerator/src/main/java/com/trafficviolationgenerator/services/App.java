package com.trafficviolationgenerator.services;


import com.trafficviolationgenerator.model.TrafficViolation;


public class App {

    public static void main(String[] args) {


        ViolationDataGeneratorService service = new ViolationDataGeneratorService();

        TrafficViolation violation = new TrafficViolation(service);


        System.out.println(violation);
    }
}
