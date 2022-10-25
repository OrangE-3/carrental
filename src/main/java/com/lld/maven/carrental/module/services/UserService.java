package com.lld.maven.carrental.module.services;

import com.lld.maven.carrental.module.models.Booking;
import com.lld.maven.carrental.module.models.accounts.User;
import com.lld.maven.carrental.module.models.PaymentInvoice;

public interface UserService {
    void register(User user);
    void book(Booking booking);
    void cancelBooking(String bookingId);
    void startTrip(String bookingId);
    PaymentInvoice endTrip(String bookingId, String rentalAreaId);
}
