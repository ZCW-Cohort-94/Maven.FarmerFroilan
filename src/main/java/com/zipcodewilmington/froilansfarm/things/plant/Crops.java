package com.zipcodewilmington.froilansfarm.things.plant;


import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Producer;

public abstract class Crops<T extends Edible> implements Producer<T>{
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    T yield;

    public Crops (T yield) {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
        this.yield = yield;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }


    @Override
    public void yield(T Edible) {
        if (hasBeenFertilized == true && hasBeenHarvested == true) {

        }

    }
}
