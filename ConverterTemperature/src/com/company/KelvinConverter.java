package com.company;

public class KelvinConverter {
   private float tempK = 273.15f;

    public void convertK(float tempC){
        float result = tempC + tempK;
        System.out.println("В " +tempC + " градусе по Цельсию - " + result + " градусов по Кельвину.");

    }
}
