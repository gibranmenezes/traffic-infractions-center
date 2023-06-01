package com.trafficRadar.services;

import com.trafficRadar.model.TrafficViolationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RadarService extends Thread{

    private static Boolean run;

    @Autowired
    private ViolationDataGeneratorService dataService;

    @Autowired
    private RequestService requestService;

    public void runService() {
        run = true;
        new Thread(() -> {
            while (run) {
                try {
                    var violation = new TrafficViolationData(dataService);
                    String response = Converter.convertObjectToJson(violation);
                    requestService.generateRequest(response);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "radarThread").run();
    }

    public void stopService() {
        run = false;
    }


}
