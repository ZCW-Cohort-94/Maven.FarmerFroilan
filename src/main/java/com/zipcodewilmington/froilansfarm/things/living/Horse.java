package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;

public class Horse extends Animal<CornEars> implements Rideable {
    @Override
    public void eat(Edible corn) {

    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }
}
