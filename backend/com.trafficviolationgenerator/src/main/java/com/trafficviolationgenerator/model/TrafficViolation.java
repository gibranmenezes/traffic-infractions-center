package com.trafficviolationgenerator.model;

import com.trafficviolationgenerator.services.ViolationDataGeneratorService;


public class TrafficViolation {
    private ViolationDataGeneratorService service;
    private String moment;
    private Integer velocity;
    private String licensePlate;
    private String vehicleClass;


    public TrafficViolation(ViolationDataGeneratorService service){
        this.moment = ViolationDataGeneratorService.moment();
        this.licensePlate = ViolationDataGeneratorService.licensePlate();
        this.velocity = ViolationDataGeneratorService.velocity();
        this.vehicleClass = ViolationDataGeneratorService.vehicleClass();

    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public void setVelocity(Integer velocity) {
        this.velocity = velocity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(moment + "\n");
        sb.append(velocity + "\n");
        sb.append(licensePlate + "\n");
        sb.append(vehicleClass + "\n");


        return sb.toString();
    }
}
