package com.lld.maven.carrental.module.models;

import com.lld.maven.carrental.module.exceptions.RentalAreaFullException;
import com.lld.maven.carrental.module.exceptions.VehicleNotFoundException;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class RentalArea {
    String id;
    private String location;
    private List<Slot> slots;

    public void addVehicle(@NonNull Vehicle vehicle){
        boolean added = false;
        for(Slot slot : slots){
            if(slot.getVehicle() == null){
               slot.setVehicle(vehicle);
               added = true;
               break;
            }
        }
        if(!added){
            throw new RentalAreaFullException();
        }
    }

    public void removeVehicle(@NonNull String licencePlate){
        boolean removed = false;
        for(Slot slot : slots){
            if(Objects.equals(slot.getVehicle().getLicencePlate(), licencePlate)){
                slot.setVehicle(null);
                removed = true;
                break;
            }
        }
        if(!removed){
            throw new VehicleNotFoundException();
        }
    }

    public boolean containsVehicle(@NonNull String licencePlate){
        for(Slot slot : slots){
            if(Objects.equals(slot.getVehicle().getLicencePlate(), licencePlate)){
                return true;
            }
        }
        return false;
    }

    public List<Vehicle> getAllVehicles(){
        List<Vehicle> result = new ArrayList<>();
        for(Slot slot : slots){
            if(slot.getVehicle()!=null)result.add(slot.getVehicle());
        }
        return result;
    }
}
