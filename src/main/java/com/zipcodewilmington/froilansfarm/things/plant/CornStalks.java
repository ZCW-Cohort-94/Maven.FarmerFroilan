package com.zipcodewilmington.froilansfarm.things.plant;

import com.zipcodewilmington.froilansfarm.Edible;

public class CornStalks extends Crops{
    @Override
    public CornEars yield(boolean hasBeenFertilized) {
        return new CornEars();
    }
}
