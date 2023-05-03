package com.zipcodewilmington.froilansfarm.things.plant;

import com.zipcodewilmington.froilansfarm.Edible;

public class CornStalks extends Crops<CornEars>{
    CornEars cornEars;

    public CornStalks(CornEars yield) {
        super(yield);
    }


    @Override
    public CornEars yield(boolean hasBeenFertilized) {
        return new CornEars();
    }
}
