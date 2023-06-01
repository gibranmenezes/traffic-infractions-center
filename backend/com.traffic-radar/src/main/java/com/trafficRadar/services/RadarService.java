package com.trafficRadar.services;

import com.trafficRadar.model.TrafficViolationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RadarService extends Thread{

    @Autowired
    private ViolationDataGeneratorService dataService;

    @Autowired
    private RequestService requestService;

    public void run() {
        while (true) {
            var violation = new TrafficViolationData(dataService);
            String response = Converter.convertObjectToJson(violation);
            requestService.generateRequest(response);
            try { Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
