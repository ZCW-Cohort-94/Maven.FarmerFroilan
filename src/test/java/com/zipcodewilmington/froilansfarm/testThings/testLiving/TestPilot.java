package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {

    @Test
    public void makeNoiseTest(){
        Pilot pilot = new Pilot();

        String expected = "Bombs Away!";
        String actual = pilot.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        Pilot pilot = new Pilot();

        boolean expected = false;
        boolean actual = pilot.mount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        Pilot pilot = new Pilot();

        boolean expected = false;
        boolean actual = pilot.dismount();

        Assert.assertEquals(expected, actual);
    }
}
