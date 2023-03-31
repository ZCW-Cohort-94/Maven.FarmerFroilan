package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
    public void mount(T Rideable);
    public void dismount(T Rideable);
}
