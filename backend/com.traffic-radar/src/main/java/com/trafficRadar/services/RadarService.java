package com.trafficRadar.services;

import com.trafficRadar.model.TrafficViolationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RadarService extends Thread{

    private static Boolean run = false;

    @Autowired
    private ViolationDataGeneratorService dataService;

    public static void setRun(Boolean run) {
        RadarService.run = run;
    }
    @Autowired
    private RequestService requestService;
    @Scheduled(fixedDelay = 3000)
    public void startRadar() {
        if (run) {
            var violation = new TrafficViolationData(dataService);
            String response = Converter.convertObjectToJson(violation);
            requestService.generateRequest(response);
        }
    }

}
