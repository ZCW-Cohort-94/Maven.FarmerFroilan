package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<T extends Rider> extends AirCraft implements FarmVehicle<Rider> {
    public void fertilize(){

    }

    @Override
    public boolean farmOperation() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "CropDuster noise";
    }
}
