package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;

public class Horse extends Animal<CornEars> implements Rideable {

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    private boolean isMounted;

    @Override
    public void eat(Edible corn) {

    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }
}
