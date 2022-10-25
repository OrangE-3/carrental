package com.lld.maven.carrental.module.services;

import com.lld.maven.carrental.module.models.AddOn;
import com.lld.maven.carrental.module.models.RentalArea;
import com.lld.maven.carrental.module.models.Vehicle;

public interface AdminService {
    void addVehicle(Vehicle vehicle);
    void addAddOn(AddOn addOn);
    void addRentalArea(RentalArea rentalArea);
}
