package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Horse;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestHorse extends TestCase {

    @Test
    public void testHorseEat(){
        Horse horse = new Horse();
    }
    @Test
    public void testHorseNoise(){
        Horse horse = new Horse();
        Assert.assertEquals("Neigh", horse.makeNoise());
    }

}
