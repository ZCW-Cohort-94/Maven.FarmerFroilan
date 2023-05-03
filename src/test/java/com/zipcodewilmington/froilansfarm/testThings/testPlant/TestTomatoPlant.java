package com.zipcodewilmington.froilansfarm.testThings.testPlant;

import com.zipcodewilmington.froilansfarm.things.plant.*;
import org.junit.Assert;
import org.junit.Test;

public class TestTomatoPlant {
    @Test
    public void testCrops() {
        Tomato tomato = new Tomato();
        Crops<Tomato> test = new TomatoPlants(tomato);
        Assert.assertTrue(test instanceof Crops);
    }

    @Test
    public void getHarvest() {
        Tomato tomato = new Tomato();
        Crops<Tomato> test = new TomatoPlants(tomato);

        boolean actual = test.hasBeenHarvested();

        Assert.assertFalse(actual);
    }

    @Test
    public void getFertilization() {
        Tomato tomato = new Tomato();
        Crops<Tomato> test = new TomatoPlants(tomato);

        boolean actual = test.hasBeenFertilized();

        Assert.assertFalse(actual);
    }

    @Test
    public void setHarvest() {
        Tomato tomato = new Tomato();
        Crops<Tomato> test = new TomatoPlants(tomato);
        boolean a = true;
        test.setHasBeenHarvested(a);

        boolean actual = test.hasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void setFertilization() {
        Tomato tomato = new Tomato();
        Crops<Tomato> test = new TomatoPlants(tomato);
        boolean a = true;
        test.setHasBeenFertilized(a);

        boolean actual = test.hasBeenFertilized();
        Assert.assertTrue(actual);
    }


    @Test
    public void testYield() {
        Tomato tomato = new Tomato();
//        TomatoPlants test = new TomatoPlants(tomato);
//        CornEars corn = new CornEars();
        Crops<Tomato> test = new TomatoPlants(tomato);
        boolean a = true;
        test.yield(a);

        Assert.assertNotNull(test);

    }

}
