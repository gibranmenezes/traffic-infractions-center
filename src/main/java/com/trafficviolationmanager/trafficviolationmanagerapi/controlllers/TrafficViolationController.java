package com.trafficviolationmanager.trafficviolationmanagerapi.controlllers;

import com.trafficviolationmanager.trafficviolationmanagerapi.entities.dtos.ViolationRecordData;
import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;
import com.trafficviolationmanager.trafficviolationmanagerapi.services.TrafficViolationService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/violations")
public class TrafficViolationController {

    @Autowired
    private TrafficViolationService service;

    @PostMapping
    public ResponseEntity<TrafficViolation> saveTrafficViolation(ViolationRecordData violationRecord){
        var trafficViolation = new TrafficViolation();
        BeanUtils.copyProperties(violationRecord, trafficViolation);
        trafficViolation.setMoment(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(trafficViolation));
    }
}
