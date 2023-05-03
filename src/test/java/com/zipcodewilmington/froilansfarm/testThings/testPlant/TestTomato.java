package com.zipcodewilmington.froilansfarm.testThings.testPlant;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.things.plant.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TestTomato {
    @Test
    public void testTomato() {
        Tomato test = new Tomato();
        Assert.assertTrue(test instanceof Edible);
    }
}
