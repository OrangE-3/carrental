package com.lld.maven.carrental.module.repositories.interfaces;

import com.lld.maven.carrental.module.models.Booking;
import com.lld.maven.carrental.module.models.PaymentInvoice;

import java.util.List;

public interface BookingRepository {
    void add(Booking booking);
    void startTrip(String bookingId);
    void endTrip(String bookingId);
    PaymentInvoice getPaymentInvoice(String bookingId);
    List<Booking> getBookingsInInterval(String userName, Long startTime, Long endTime);
}
