package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.things.living.Chicken;
import com.zipcodewilmington.froilansfarm.things.living.Egg;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestChicken extends TestCase {

    @Test
    public void testMakeNoise() {
        Chicken chicken = new Chicken();
        Assert.assertEquals("Buckaw", chicken.makeNoise());
    }

//    @Test
//    public void testEat() {
//        Chicken chicken = new Chicken();
//        Edible corn = new Edible() {};
//        Assert.(chicken.eat(corn));
//    } Still dont understand how to test voids :(

    @Test
    public void testYield() {
        Chicken chicken = new Chicken();
        Assert.assertEquals(new Egg(), chicken.yield(true));
        }
    }
