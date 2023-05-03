package com.zipcodewilmington.froilansfarm.testThings.testMachine;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import com.zipcodewilmington.froilansfarm.things.machine.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TestAirCraft {

    @Test
    public void makeNoiseTest(){
        AirCraft aircraft = new AirCraft();

        String expected = "airplane noise";
        String actual = aircraft.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritanceVehicle() {
        Vehicle<Pilot> test = new AirCraft<>();
        Assert.assertTrue(test instanceof NoiseMaker);
    }

    @Test
    public void testInheritanceVehicle2() {
        AirCraft<Vehicle> test = new AirCraft<>();
        Assert.assertTrue(test instanceof Rideable);
    }



    @Test
    public void testGetMounted() {
        AirCraft<Vehicle> test = new AirCraft<>();

        boolean actual = false;
        test.setMounted(actual);
        boolean expected = test.getMounted();


        Assert.assertEquals(actual, expected);
    }



}
