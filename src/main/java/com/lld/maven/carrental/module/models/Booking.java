package com.lld.maven.carrental.module.models;

import com.lld.maven.carrental.module.models.accounts.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking {
    private String id;
    private User user;
    private Vehicle vehicle;
    private Trip trip;
    private List<AddOn> addOns;
}
