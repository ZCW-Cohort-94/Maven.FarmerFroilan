package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;

public class Pilot<T extends AirCraft> extends Person implements Rider<T> {
//    Pilot<AirCraft> pilot = new Pilot<>();
    AirCraft airCraft;

    public Pilot() {
        name = "Froilanda";

    }

    @Override
    public void eat(Edible edible) {edible = null;

    }

    @Override
    public String makeNoise() {
        return "Bombs Away!";
    }

    @Override
    public void mount(AirCraft airCraft) {
        airCraft.setMounted(true);
    }

    @Override
    public void dismount(AirCraft airCraft) {
        airCraft.setMounted(false);

    }

//    public String fly (AirCraft airCraft){
//        return "I'm flying!";
//    }
}
