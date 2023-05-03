package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import com.zipcodewilmington.froilansfarm.things.machine.CropDuster;
import com.zipcodewilmington.froilansfarm.things.machine.Tractor;
import com.zipcodewilmington.froilansfarm.things.machine.Vehicle;

public class Farmer<T extends Tractor> extends Botanist implements Rider<T>{

    T ride;

    public Farmer(String name) {
        super(name);
    }


    @Override
    public void mount(T ride) {
        ride.setMounted(true);
    }

    @Override
    public void dismount(T ride) {
        ride.setMounted(false);

    }
}
