package com.company;

public abstract class  CoffeeMach implements CofeMash {
    float fullWater;
    float fullCoffee;

    float waterVolume;
    float coffeeVolume;
    String name;



    public void getVolume () {
        System.out.print("В баке осталось ");
        System.out.print(waterVolume);
        System.out.println(" милилитров");
        System.out.print("В баке осталось ");
        System.out.print(coffeeVolume);
        System.out.println(" грамм");


    }
    public void info () {
        System.out.print("Вас обслуживает кофемашина ");
        System.out.println(name);
        System.out.print("Полный бак воды состовляет ");
        System.out.print(fullWater);
        System.out.println(" милилитров.");
        System.out.print("Полный бак кофе состовляет ");
        System.out.print(fullCoffee);
        System.out.println(" грамм.");

    }
    public void getAmericano () {
        if (waterVolume <= 200) {
            System.out.println("Осталось мало воды. Заполните пожалуйста бак воды");
        }else
            waterVolume -= 200f;
        if (coffeeVolume <= 20) {
            System.out.println("Осталось мало кофе. Заполните пожалуйста бак кофе");
        }else {
            coffeeVolume -= 10f;
            System.out.println("Возьмите ваш Американо");
        }
    }
    public void getEcpresso () {
        if (waterVolume <= 200) {
            System.out.println("Осталось мало воды. Заполните пожалуйста бак воды");
        } else
            waterVolume -= 50f;
        if (coffeeVolume <= 20) {
            System.out.println("Осталось мало кофе. Заполните пожалуйста бак кофе");
        }else {
            coffeeVolume -= 10f;
            System.out.println("Возьмите ваш Эспрессо");
        }
    }
    public void get2Ecpresso () {
        if (waterVolume <= 200) {
            System.out.println("Осталось мало воды. Заполните пожалуйста бак воды");
        }else
            waterVolume -= 60f;
        if (coffeeVolume <= 20) {
            System.out.println("Осталось мало кофе. Заполните пожалуйста бак кофе");
        }
        else {
            coffeeVolume -= 20f;
            System.out.println("Возьмите ваше двойное Эспрессо");
        }
    }
    public void addWater () {
        if (waterVolume == fullWater) {
            System.out.println("Воды достаточно");
        }else {
            waterVolume = fullWater;
            System.out.println("Бак с водой заполнен");
        }
    }
    public void addCoffee () {
        if (coffeeVolume == fullCoffee) {
            System.out.println("Кофе достаточно");
        }else {
            coffeeVolume = fullCoffee;
            System.out.println("Бак с кофе заполнен");
        }
    }
    public void offAutomat () {
        System.out.println("Машина выключается.До свидания!!!");
    }







}
