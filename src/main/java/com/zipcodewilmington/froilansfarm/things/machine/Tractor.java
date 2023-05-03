package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.storage.CropRow;

public class Tractor<T extends Rider> extends Vehicle implements FarmVehicle<Rider> {

    public void harvest() {
    }


    @Override
    public boolean farmOperation() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Tractor noise";
    }
}
