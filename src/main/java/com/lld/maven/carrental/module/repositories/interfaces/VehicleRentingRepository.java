package com.lld.maven.carrental.module.repositories.interfaces;

import com.lld.maven.carrental.module.models.RentalArea;
import com.lld.maven.carrental.module.models.Vehicle;

import java.util.List;

public interface VehicleRentingRepository {
    void add(RentalArea rentalArea);
    void addVehicle(String rentalAreaId, Vehicle vehicle);
    void lendVehicle(String rentalAreaId, String licencePlate);
    void returnVehicle(String rentalAreaId, String licencePlate);
    List<RentalArea> getRentalAreas();
}
