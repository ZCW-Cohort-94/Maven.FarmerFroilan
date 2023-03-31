package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.things.living.Botanist;
import com.zipcodewilmington.froilansfarm.things.living.Egg;
import org.junit.Test;
import org.junit.Assert;
public class TestBotanist {
    Botanist person = new Botanist("Jake");
    @Test
    public void testConstructor(){
    }
    @Test
    public void testGetName(){

        String actual = person.getName();

        Assert.assertEquals("Jake", actual);
    }
    @Test
    public void testSetName(){
        person.setName("Nora");

        Assert.assertEquals("Nora", person.getName());
    }
    @Test
    public void testMakeNoise(){
        String actual = person.makeNoise();
        String expected = "Brawnda has what plants crave!";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEat(){
        Egg egg = new Egg();
        person.eat(egg);
        Assert.assertNull(egg);
    }
    @Test
    public  void  testPlant(){

    }
}
