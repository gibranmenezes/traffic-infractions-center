package com.trafficRadar.services;

import com.trafficRadar.model.TrafficViolationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RadarService {

    @Autowired
    private ViolationDataGeneratorService dataService;

    @Autowired
    private RequestService requestService;


    @Scheduled (fixedDelay = 3000)
    public void radarActvation() {
        var violation = new TrafficViolationData(dataService);
        String response = Converter.convertObjectToJson(violation);
        requestService.generateRequest(response);
    }
}
