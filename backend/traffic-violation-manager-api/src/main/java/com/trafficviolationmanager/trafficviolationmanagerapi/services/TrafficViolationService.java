package com.trafficviolationmanager.trafficviolationmanagerapi.services;

import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;
import com.trafficviolationmanager.trafficviolationmanagerapi.repositories.TrafficViolationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficViolationService {

    @Autowired
    private TrafficViolationRepository repository;

    @Transactional
    public TrafficViolation save(TrafficViolation trafficViolation){
        return repository.save(trafficViolation);
    }


    public List<TrafficViolation> findAll() {
        return repository.findAll();
    }
}
