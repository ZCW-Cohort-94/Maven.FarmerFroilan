package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.Tractor;

public class Farmer extends Botanist implements Rider{

    public Farmer(String name) {
        super(name);
    }

    @Override
    public boolean mount() {
        return false;
    }

    @Override
    public boolean dismount() {
        return false;
    }
}
