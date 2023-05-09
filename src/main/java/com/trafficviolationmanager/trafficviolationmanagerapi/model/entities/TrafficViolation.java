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
@Entity(name = "Traffic Violation")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TrafficViolation implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MOMENT")
    private LocalDateTime moment;

    @Column(name = "VELOCITY")
    private Double velocity;
    @Column(name = "LICENSE_PLATE")
    private String licensePlate;

    @Column(name = "VEHICLE_CLASS")
    @Enumerated(EnumType.STRING)
    private VehicleClass vehicleClass;

    public TrafficViolation(ViolationRecordData violationRecord) {
        //this.moment = violationRecord.moment();
        this.velocity = violationRecord.velocity();
        this.licensePlate = violationRecord.licensePlate();
        this.vehicleClass = violationRecord.vehicleClass();

    }
}
