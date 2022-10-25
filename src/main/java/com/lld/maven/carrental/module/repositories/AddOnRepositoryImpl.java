package com.lld.maven.carrental.module.repositories;

import com.lld.maven.carrental.module.models.AddOn;

import java.util.List;
import java.util.Map;

public class AddOnRepositoryImpl implements AddOnRepository{
    Map<String, AddOn>  addOnMap;
    @Override
    public void add(AddOn addOn) {
        addOnMap.putIfAbsent(addOn.getId(), addOn);
    }

    @Override
    public List<AddOn> getAll() {
        return addOnMap.values().stream().toList();
    }
}
