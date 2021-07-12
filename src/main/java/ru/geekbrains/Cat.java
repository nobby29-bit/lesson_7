package ru.geekbrains;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;


    public Cat (String name, int appetite, boolean hunger){
        this.name = name;
        this.appetite = appetite;
        if (hunger) this.hunger = true;
        else this.hunger = false;
    }

    public void eat(Plate p){
        this.hunger = p.decreaseFood(appetite,this.name);
        if (hunger){
            System.out.println("Я голодный");
        }
    }

    public String getName(){ return name;}
}
