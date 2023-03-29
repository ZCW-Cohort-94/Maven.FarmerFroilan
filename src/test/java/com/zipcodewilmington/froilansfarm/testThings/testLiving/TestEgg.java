package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.things.living.Egg;
import org.junit.Assert;
import org.junit.Test;

public class TestEgg {

    @Test
    public void testEgg() {
        Egg test = new Egg();
        Assert.assertTrue(test instanceof Edible);
    }
}
