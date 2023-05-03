package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.Storage;

import java.util.ArrayList;

public class Field extends ArrayList<CropRow> {
    private static Field field = null;
    public static ArrayList<CropRow> getField(){
        if (field == null){
            field = new Field();
        }
        return field;
    }
}
