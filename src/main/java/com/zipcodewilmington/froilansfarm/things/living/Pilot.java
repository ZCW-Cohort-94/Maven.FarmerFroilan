package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;

public abstract class Pilot extends Person implements Rider<AirCraft> {
    AirCraft airCraft;

    public boolean mount(AirCraft airCraft) {
        return false;
    }


    public boolean dismount(AirCraft airCraft) {
        return false;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void eat() {

    }
}
