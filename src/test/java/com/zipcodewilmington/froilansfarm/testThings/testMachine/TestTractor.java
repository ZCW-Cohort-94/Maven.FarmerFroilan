package com.zipcodewilmington.froilansfarm.testThings.testMachine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.things.living.Farmer;
import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import com.zipcodewilmington.froilansfarm.things.machine.Tractor;
import com.zipcodewilmington.froilansfarm.things.machine.Vehicle;
import com.zipcodewilmington.froilansfarm.things.plant.Crops;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTractor {

    @Test
    public void makeNoiseTest(){
        Tractor aircraft = new Tractor();

        String expected = "Tractor noise";
        String actual = aircraft.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritanceTractor() {
        Tractor<Farmer> test = new Tractor<>();
        Assert.assertTrue(test instanceof Vehicle);
    }

    @Test
    public void testInheritanceTractor2() {
        Vehicle<Farmer> test = new Tractor<>();
        Assert.assertTrue(test instanceof FarmVehicle);
    }


    @Test
    public void testGetMounted() {
        Tractor<Farmer> test = new Tractor<>();

        boolean actual = false;
        test.setMounted(actual);
        boolean expected = test.getMounted();


        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHarvest() {
        Tractor<Farmer> test = new Tractor<>();
        test.harvest();
        ArrayList<Crops> testing = new ArrayList<>();
        Assert.assertNotNull(testing);
    }

    @Test
    public void testFarmOperation() {
        Tractor<Farmer> test = new Tractor<>();
        boolean actual = test.farmOperation();
        Assert.assertFalse(actual);
    }


}
