package com.trafficRadar.controller;

import com.trafficRadar.services.RadarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/radar")
public class RadarController {

    private static final String SCHEDULED_TASKS = "scheduledTasks";
    @Autowired
    private RadarService radarService;

    @Autowired
    private ScheduledAnnotationBeanPostProcessor postProcessor;

    @GetMapping(value = "/start")
        public String startRadar() {
            postProcessor.postProcessAfterInitialization(radarService, SCHEDULED_TASKS);
            return "OK";
        }
    @GetMapping(value = "/stop")
    public String stopRadar() {
        postProcessor.postProcessBeforeDestruction(radarService, SCHEDULED_TASKS);
        return "OK";
    }

}
