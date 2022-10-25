package com.lld.maven.carrental.module.models;

import com.lld.maven.carrental.module.exceptions.TripAlreadyEndedException;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Trip {
    private Long startTime;
    private Long endTime;
    private PaymentInvoice paymentInvoice;

    public void endTrip(@NonNull Long endTime){
        if(this.endTime != null || paymentInvoice != null){
            throw new TripAlreadyEndedException();
        }
        this.endTime = endTime;
        paymentInvoice = new PaymentInvoice();
        paymentInvoice.setInvoiceId(UUID.randomUUID().toString());
        paymentInvoice.setAmount(Math.toIntExact((this.endTime - startTime)/5));
    }
}
