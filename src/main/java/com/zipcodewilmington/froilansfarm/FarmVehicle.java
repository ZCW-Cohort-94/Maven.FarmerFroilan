package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.things.machine.Vehicle;

public interface FarmVehicle<T extends Rider>  {
    public boolean farmOperation();
}
