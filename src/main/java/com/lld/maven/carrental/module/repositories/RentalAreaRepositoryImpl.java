package com.lld.maven.carrental.module.repositories;

import com.lld.maven.carrental.module.models.RentalArea;
import com.lld.maven.carrental.module.models.Vehicle;

import java.util.List;
import java.util.Map;

public class RentalAreaRepositoryImpl implements RentalAreaRepository{
    Map<String, RentalArea> rentalAreaMap;
    Map<String, Vehicle> vehicleMap;
    @Override
    public void add(RentalArea rentalArea) {
        rentalAreaMap.put(rentalArea.getId(),rentalArea);
        for(Vehicle vehicle : rentalArea.getAllVehicles()){
            vehicleMap.putIfAbsent(vehicle.getLicencePlate(), vehicle);
        }
    }

    @Override
    public void addVehicle(String rentalAreaId, Vehicle vehicle) {
        rentalAreaMap.get(rentalAreaId).addVehicle(vehicle);
        vehicleMap.putIfAbsent(vehicle.getLicencePlate(), vehicle);
    }

    @Override
    public void lendVehicle(String rentalAreaId, String licencePlate) {
        rentalAreaMap.get(rentalAreaId).removeVehicle(licencePlate);
    }

    @Override
    public void returnVehicle(String rentalAreaId, String licencePlate) {
        rentalAreaMap.get(rentalAreaId).addVehicle(vehicleMap.get(licencePlate));
    }

    @Override
    public List<RentalArea> getRentalAreas() {
        return rentalAreaMap.values().stream().toList();
    }


}
