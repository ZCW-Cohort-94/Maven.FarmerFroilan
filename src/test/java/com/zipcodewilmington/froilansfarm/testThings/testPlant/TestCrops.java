package com.zipcodewilmington.froilansfarm.testThings.testPlant;

import com.zipcodewilmington.froilansfarm.Producer;
import com.zipcodewilmington.froilansfarm.things.plant.Crops;
import com.zipcodewilmington.froilansfarm.things.plant.Tomato;
import com.zipcodewilmington.froilansfarm.things.plant.TomatoPlants;
import org.junit.Assert;
import org.junit.Test;

public class TestCrops {

    @Test
    public void testCrops() {
        Tomato tomato = new Tomato();
        Crops test = new Crops(tomato);
        Assert.assertTrue(test instanceof Producer);
    }

    @Test
    public void getHarvest() {
        Tomato tomato = new Tomato();
        Crops test = new Crops(tomato);

        boolean actual = test.hasBeenHarvested();

        Assert.assertFalse(actual);
    }

    @Test
    public void getFertilization() {
        Tomato tomato = new Tomato();
        Crops test = new Crops(tomato);

        boolean actual = test.hasBeenFertilized();

        Assert.assertFalse(actual);
    }

    @Test
    public void setHarvest() {
        Tomato tomato = new Tomato();
        Crops test = new Crops(tomato);
        boolean a = true;
        test.setHasBeenHarvested(a);

        boolean actual = test.hasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void setFertilization() {
        Tomato tomato = new Tomato();
        Crops test = new Crops(tomato);
        boolean a = true;
        test.setHasBeenFertilized(a);

        boolean actual = test.hasBeenFertilized();
        Assert.assertTrue(actual);
    }

}
