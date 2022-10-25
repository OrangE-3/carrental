package com.lld.maven.carrental.module.services;

import com.lld.maven.carrental.module.models.AddOn;
import com.lld.maven.carrental.module.models.Booking;
import com.lld.maven.carrental.module.models.RentalArea;

import java.util.List;

public interface SearchService {
    RentalArea getRentalArea(String rentalAreaId);
    List<RentalArea> getRentalAreas();
    List<AddOn> getAvailableAddOns();
    List<Booking> getBookings(String userName, String startTime, String endTime);
}
