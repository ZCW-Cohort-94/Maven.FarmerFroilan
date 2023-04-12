package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {
    Pilot pilot = new Pilot();
    AirCraft airCraft = new AirCraft();

    @Test
    public void makeNoiseTest(){

        String expected = "Bombs Away!";
        String actual = pilot.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){

        boolean expected = true;
        boolean actual;

        pilot.mount(airCraft);
        actual = airCraft.isMounted();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void dismountTest(){

        boolean expected = false;
        boolean actual;

        pilot.mount(airCraft);
        pilot.dismount(airCraft);

        actual = airCraft.isMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flyTest(){

    }
}
