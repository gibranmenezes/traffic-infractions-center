package com.trafficviolationmanager.trafficviolationmanagerapi.controlllers;

import com.trafficviolationmanager.trafficviolationmanagerapi.model.dtos.ViolationListData;
import com.trafficviolationmanager.trafficviolationmanagerapi.model.dtos.ViolationRecordData;
import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;
import com.trafficviolationmanager.trafficviolationmanagerapi.services.TrafficViolationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("violations")
public class TrafficViolationController {

    @Autowired
    private TrafficViolationService service;

    @PostMapping
        public ResponseEntity<TrafficViolation> saveTrafficViolation(@RequestBody @Valid ViolationRecordData violationRecord){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(new TrafficViolation(violationRecord)));
    }

    @GetMapping
    public ResponseEntity<List<ViolationListData>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll()
                .stream()
                .map((ViolationListData::new))
                .toList());
    }
}
