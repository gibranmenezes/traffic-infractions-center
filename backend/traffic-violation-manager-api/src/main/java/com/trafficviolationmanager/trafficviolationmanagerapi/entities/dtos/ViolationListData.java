package com.trafficviolationmanager.trafficviolationmanagerapi.entities.dtos;


import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;
import com.trafficviolationmanager.trafficviolationmanagerapi.model.enums.VehicleClass;

import java.time.LocalDateTime;

public record ViolationListData(
        Long id, String moment, Integer velocity, String licensePlate, String vehicleClass)
{
    public ViolationListData(TrafficViolation trafficViolation){
        this(trafficViolation.getId(), trafficViolation.getMoment(), trafficViolation.getVelocity(),
                        trafficViolation.getLicensePlate(),trafficViolation.getVehicleClass());
    }


}
