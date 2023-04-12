package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public abstract class Vehicle<T extends Rider> implements NoiseMaker, Rideable<T> {

    public boolean getMounted() {
        return this.isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    private boolean isMounted;


}
