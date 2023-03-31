package com.zipcodewilmington.froilansfarm.things.living;


import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Person extends Animal{
    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    private boolean isMounted;
    String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void eat(Edible edible) {

    }
}
