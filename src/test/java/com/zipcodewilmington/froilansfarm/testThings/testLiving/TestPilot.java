package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {
    Pilot pilot = new Pilot();

    @Test
    public void makeNoiseTest(){

        String expected = "Bombs Away!";
        String actual = pilot.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){

        boolean expected = false;
        boolean actual = pilot.mount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){

        boolean expected = false;
        boolean actual = pilot.dismount();

        Assert.assertEquals(expected, actual);
    }
}
