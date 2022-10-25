package com.lld.maven.carrental.module.repositories;

import com.lld.maven.carrental.module.models.Booking;
import com.lld.maven.carrental.module.models.PaymentInvoice;
import com.lld.maven.carrental.module.models.Trip;
import com.lld.maven.carrental.module.repositories.interfaces.BookingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BookingRepositoryImpl implements BookingRepository {
    Map<String, Booking> bookingMap;

    @Override
    public void add(Booking booking) {
        bookingMap.putIfAbsent(booking.getId(), booking);
    }

    @Override
    public void startTrip(String bookingId) {
        Trip trip = new Trip();
        trip.setStartTime(System.currentTimeMillis());
        bookingMap.get(bookingId).setTrip(trip);
    }

    @Override
    public void endTrip(String bookingId) {
        bookingMap.get(bookingId).getTrip().endTrip(System.currentTimeMillis());
    }

    @Override
    public PaymentInvoice getPaymentInvoice(String bookingId) {
        return bookingMap.get(bookingId).getTrip().getPaymentInvoice();
    }

    @Override
    public List<Booking> getBookingsInInterval(String userName, Long startTime, Long endTime) {
        List<Booking> result = new ArrayList<>();
        for(Booking booking : bookingMap.values()){
            if(Objects.equals(booking.getUser().getUserName(), userName)
                    && booking.getTrip().getStartTime()>=startTime
                    && booking.getTrip().getEndTime()<=endTime){
               result.add(booking);
            }
        }
        return result;
    }
}
