package com.trafficviolationmanager.trafficviolationmanagerapi.entities.dtos;

import com.trafficviolationmanager.trafficviolationmanagerapi.model.enums.VehicleClass;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record ViolationRecordData(
        /*@NotBlank
        LocalDateTime moment,*/
        @NotBlank
        Double velocity,
        @NotBlank
        @Size(max=7)
        String licensePlate,
        @NotBlank
        VehicleClass vehicleClass
) {

}
