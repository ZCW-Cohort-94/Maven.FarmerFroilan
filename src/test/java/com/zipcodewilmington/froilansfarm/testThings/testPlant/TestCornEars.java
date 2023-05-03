package com.zipcodewilmington.froilansfarm.testThings.testPlant;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;
import org.junit.Assert;
import org.junit.Test;

public class TestCornEars {

    @Test
    public void testCornEars() {
        CornEars test = new CornEars();
        Assert.assertTrue(test instanceof Edible);
    }
}
