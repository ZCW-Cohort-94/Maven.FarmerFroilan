package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Farmer;
import com.zipcodewilmington.froilansfarm.things.machine.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {
    Farmer farmer = new Farmer("");
    Tractor tractor = new Tractor();
    @Test
    public void mountTest(){

        boolean expected = true;
        boolean actual;

        farmer.mount(tractor);
        actual = tractor.getMounted();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void dismountTest(){

        boolean expected = false;
        boolean actual;

        farmer.mount(tractor);
        farmer.dismount(tractor);

        actual = tractor.getMounted();

        Assert.assertEquals(expected, actual);
    }
}
