package com.trafficviolationmanager.trafficviolationmanagerapi.model.dtos;


import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;

public record ViolationListData(
        Long id, String moment, Integer velocity, String licensePlate, String vehicleClass)
{
    public ViolationListData(TrafficViolation trafficViolation){
        this(trafficViolation.getId(), trafficViolation.getMoment(), trafficViolation.getVelocity(),
                        trafficViolation.getLicensePlate(),trafficViolation.getVehicleClass());
    }
}
