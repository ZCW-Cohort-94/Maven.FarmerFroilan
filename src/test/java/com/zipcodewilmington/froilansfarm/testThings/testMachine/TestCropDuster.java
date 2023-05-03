package com.zipcodewilmington.froilansfarm.testThings.testMachine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;
import com.zipcodewilmington.froilansfarm.things.living.Farmer;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import com.zipcodewilmington.froilansfarm.things.machine.CropDuster;
import com.zipcodewilmington.froilansfarm.things.machine.Tractor;
import com.zipcodewilmington.froilansfarm.things.machine.Vehicle;
import com.zipcodewilmington.froilansfarm.things.plant.Crops;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCropDuster {

    @Test
    public void makeNoiseTest(){
        CropDuster<Farmer> tester = new CropDuster<>();

        String expected = "CropDuster noise";
        String actual = tester.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritanceCropDuster() {
        CropDuster<Farmer> tester = new CropDuster<>();
        Assert.assertTrue(tester instanceof AirCraft);
    }

    @Test
    public void testInheritanceCropDuster2() {
        CropDuster<Farmer> tester = new CropDuster<>();
        Assert.assertTrue(tester instanceof FarmVehicle);
    }


    @Test
    public void testGetMounted() {
        CropDuster<Farmer> tester = new CropDuster<>();

        boolean actual = false;
        tester.setMounted(actual);
        boolean expected = tester.getMounted();


        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFertilize() {
        CropDuster<Farmer> tester = new CropDuster<>();
        tester.fertilize();
        ArrayList<Crops> testing = new ArrayList<>();
        Assert.assertNotNull(testing);
    }

    @Test
    public void testFarmOperation() {
        CropDuster<Farmer> tester = new CropDuster<>();
        boolean actual = tester.farmOperation();
        Assert.assertFalse(actual);
    }

}
