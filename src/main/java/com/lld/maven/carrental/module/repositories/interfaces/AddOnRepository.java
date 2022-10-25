package com.lld.maven.carrental.module.repositories.interfaces;

import com.lld.maven.carrental.module.models.AddOn;

import java.util.List;

public interface AddOnRepository {
    void add(AddOn addOn);
    List<AddOn> getAll();
}
