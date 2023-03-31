package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.storage.CropRow;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.things.plant.Crops;

public class Botanist extends Person{
    public Botanist(String name){}
    @Override
    public void eat(Edible edible) {
        edible = null;
    }
    @Override
    public String makeNoise() {
        return "Brawndo has what plants crave!";
    }

    public void plant(Crops crop, int plot){
     //   Field.getField().add();
    }
}
