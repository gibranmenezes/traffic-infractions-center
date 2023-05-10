package com.trafficviolationmanager.trafficviolationmanagerapi.repositories;

import com.trafficviolationmanager.trafficviolationmanagerapi.model.entities.TrafficViolation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficViolationRepository extends JpaRepository<TrafficViolation, Long> {
}
