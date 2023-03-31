package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Chicken;
import junit.framework.TestCase;
import org.junit.Assert;

public class TestChicken extends TestCase {
    public void testMakeNoise() {
        Chicken chicken = new Chicken();
        Assert.assertEquals("Buckaw", chicken.makeNoise());
    }

    public void testEat() {
    }

    public void testYield() {
    }
}
