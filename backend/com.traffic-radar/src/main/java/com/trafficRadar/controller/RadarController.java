package com.trafficRadar.controller;

import com.trafficRadar.services.RadarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/radar")
public class RadarController {

    @Autowired
    private RadarService radar;

    @GetMapping(value = "/start")
        public String startRadar() {
            radar.start();
            return "OK";
        }
    @GetMapping(value = "/stop")
    public String stopRadar() {
        radar.interrupt();
        return "OK";
    }

}
