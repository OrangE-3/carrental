package com.lld.maven.carrental.module.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String licencePlate;
    private VehicleType vehicleType;
    private String vehicleName;
}
