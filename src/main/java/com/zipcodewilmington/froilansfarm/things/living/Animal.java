package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

import java.util.Collections;

public abstract class Animal<T extends Edible> implements Eater, NoiseMaker {
    public void eat(){

    }

}
