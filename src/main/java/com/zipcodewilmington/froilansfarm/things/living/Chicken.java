package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Producer;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;

public class Chicken extends Animal<CornEars> implements Producer<Egg>{

    @Override
    public String makeNoise() {
        return "Buckaw";
    }

    @Override
    public Egg yield(boolean hasBeenFertilized) {
        return new Egg();

    }

    @Override
    public void eat(Edible corn) {

    }
}
