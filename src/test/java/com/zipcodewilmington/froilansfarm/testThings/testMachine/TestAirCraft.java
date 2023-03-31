package com.zipcodewilmington.froilansfarm.testThings.testMachine;

import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import org.junit.Assert;
import org.junit.Test;

public class TestAirCraft {

    @Test
    public void makeNoiseTest(){
        AirCraft aircraft = new AirCraft();

        String expected = "Vroom vroom!";
        String actual = aircraft.makeNoise();

        Assert.assertEquals(expected,actual);
    }
}
