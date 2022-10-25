package com.lld.maven.carrental.module.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentInvoice {
    private String invoiceId;
    private int amount;
}
