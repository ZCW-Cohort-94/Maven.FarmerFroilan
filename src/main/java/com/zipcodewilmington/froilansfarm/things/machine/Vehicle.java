package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Vehicle implements NoiseMaker, Rideable {

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    private boolean isMounted;

    @Override
    public String makeNoise() {
        return "Vroom vroom!";
    }
}
