package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s = (numberOfPaws>1)?"s":"";
        String fur = (hasFur)?"a":"no";
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paw"+s+" and "+fur+" fur.";
    }

}

