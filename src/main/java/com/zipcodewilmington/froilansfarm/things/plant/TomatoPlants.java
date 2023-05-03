package com.zipcodewilmington.froilansfarm.things.plant;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.storage.CropRow;

public class TomatoPlants extends Crops<Tomato> {

    public TomatoPlants(Tomato yield) {
        super(yield);
    }

    @Override
    public Tomato yield(boolean hasBeenFertilized) {
        return new Tomato();
    }
}
