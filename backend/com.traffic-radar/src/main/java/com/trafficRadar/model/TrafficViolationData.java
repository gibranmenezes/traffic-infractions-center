package com.trafficRadar.model;

import com.trafficRadar.services.ViolationDataGeneratorService;

public record TrafficViolationData(String moment, Integer velocity, String licensePlate, String vehicleClass) {

    public TrafficViolationData(ViolationDataGeneratorService data){
        this(data.moment(), data.velocity(), data.licensePlate(), data.vehicleClass());

    }
}
