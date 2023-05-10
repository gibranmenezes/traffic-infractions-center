package com.trafficviolationmanager.trafficviolationmanagerapi.model.entities;

import com.trafficviolationmanager.trafficviolationmanagerapi.model.dtos.ViolationRecordData;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "violations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TrafficViolation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moment;
    private Integer velocity;

    private String licensePlate;

   private String vehicleClass;

    public TrafficViolation(ViolationRecordData violationRecord) {
        this.moment = violationRecord.moment();
        this.velocity = violationRecord.velocity();
        this.licensePlate = violationRecord.licensePlate();
        this.vehicleClass = violationRecord.vehicleClass();

    }
}
