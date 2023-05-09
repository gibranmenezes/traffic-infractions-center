package com.trafficviolationmanager.trafficviolationmanagerapi.model.entities;

import com.trafficviolationmanager.trafficviolationmanagerapi.entities.dtos.ViolationRecordData;
import com.trafficviolationmanager.trafficviolationmanagerapi.model.enums.VehicleClass;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "violations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TrafficViolation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime moment;


    private Double velocity;

    private String licensePlate;

    @Enumerated(EnumType.STRING)
    private VehicleClass vehicleClass;

    public TrafficViolation(ViolationRecordData violationRecord) {
        this.moment = violationRecord.moment();
        this.velocity = violationRecord.velocity();
        this.licensePlate = violationRecord.licensePlate();
        this.vehicleClass = violationRecord.vehicleClass();

    }
}
