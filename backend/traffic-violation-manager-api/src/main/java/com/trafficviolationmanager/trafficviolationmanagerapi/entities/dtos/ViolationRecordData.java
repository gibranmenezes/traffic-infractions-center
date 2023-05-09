package com.trafficviolationmanager.trafficviolationmanagerapi.entities.dtos;


import com.trafficviolationmanager.trafficviolationmanagerapi.model.enums.VehicleClass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.Valid;

import java.time.LocalDateTime;

public record ViolationRecordData(
        @NotNull
        LocalDateTime moment,
        @NotNull
        Integer velocity,
        @NotNull
        @Size(max=7)
        String licensePlate,
        @NotNull
        String vehicleClass
) {

}
