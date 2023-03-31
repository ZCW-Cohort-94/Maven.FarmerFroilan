package com.zipcodewilmington.froilansfarm;

public interface Producer<T extends Edible>{
    public T yield(boolean hasBeenFertilized);
}
