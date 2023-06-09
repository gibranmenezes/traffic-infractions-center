package com.trafficRadar.model;

import com.trafficRadar.services.ViolationDataGeneratorService;


public class TrafficViolation {
    private ViolationDataGeneratorService service;
    private String moment;
    private Integer velocity;
    private String licensePlate;
    private String vehicleClass;


    public TrafficViolation(TrafficViolationData data){
        this.moment = data.moment();
        this.licensePlate = data.licensePlate();
        this.velocity = data.velocity();
        this.vehicleClass = data.vehicleClass();

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
