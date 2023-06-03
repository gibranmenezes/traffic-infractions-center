package com.trafficRadar.controller;

import com.trafficRadar.services.RadarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/radar")
public class RadarController {

    @GetMapping(value = "/start")
    public String startRadar() {
        RadarService.setRun(true);
        return "OK";
    }
    @GetMapping(value = "/stop")
    public String stopRadar() {
        RadarService.setRun(false);
        return "OK";
    }

}
