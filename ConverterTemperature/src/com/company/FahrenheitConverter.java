package com.company;

public class FahrenheitConverter {

    public void convertF(float tempC){
        float result = tempC * 1.8f + 32;
        System.out.println("В " +tempC + " градусе по Цельсию - " + result + " градусов по Фаренгейту.");

    }
}
