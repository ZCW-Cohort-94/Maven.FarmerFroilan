package com.zipcodewilmington.froilansfarm.testThings.testPlant;

import com.zipcodewilmington.froilansfarm.things.plant.*;
import org.junit.Assert;
import org.junit.Test;

public class TestCornStalks {
        @Test
    public void testCrops() {
        CornEars corn = new CornEars();
        CornStalks test = new CornStalks(corn);
        Assert.assertTrue(test instanceof Crops);
    }

    @Test
    public void getHarvest() {
        CornEars corn = new CornEars();
        CornStalks test = new CornStalks(corn);

        boolean actual = test.hasBeenHarvested();

        Assert.assertFalse(actual);
    }

    @Test
    public void getFertilization() {
        CornEars corn = new CornEars();
        CornStalks test = new CornStalks(corn);

        boolean actual = test.hasBeenFertilized();

        Assert.assertFalse(actual);
    }

    @Test
    public void setHarvest() {
        CornEars corn = new CornEars();
        CornStalks test = new CornStalks(corn);
        boolean a = true;
        test.setHasBeenHarvested(a);

        boolean actual = test.hasBeenHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void setFertilization() {
        CornEars corn = new CornEars();
        CornStalks test = new CornStalks(corn);
        boolean a = true;
        test.setHasBeenFertilized(a);

        boolean actual = test.hasBeenFertilized();
        Assert.assertTrue(actual);
    }

//    @Test
//    public void testYield() {
//        CornEars corn = new CornEars();
//        CornStalks test = new CornStalks(corn);
//        boolean a = true;
//        test.yield(a);
//
//        Assert.assertFalse();
//    }

    @Test
    public void testYield() {
        Tomato tomato = new Tomato();
        TomatoPlants test = new TomatoPlants(tomato);
        boolean a = true;
        test.yield(a);

        Assert.assertNotNull(test);

    }



}
