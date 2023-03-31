package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;

public class Pilot<Aircraft> extends Person implements Rider<AirCraft> {
    Pilot pilot = new Pilot();
    AirCraft airCraft;

    public Pilot() {
        name = "Froilanda";

    }

    @Override
    public void eat() {

    }

    @Override
    public String makeNoise() {
        return "Bombs Away!";
    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }

    public String fly (AirCraft airCraft){
        return "I'm cropdusting!";
    }
}
