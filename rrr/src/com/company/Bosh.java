package com.company;

public class Bosh extends CoffeeMach implements CofeMash {
    public Bosh (String name,float waterVolume,float coffeeVolume) {
        this.waterVolume = waterVolume;
        this.coffeeVolume = coffeeVolume;
        this.name = name;
        this.fullCoffee = 3000f;
        this.fullWater = 10000f;
    }





}
