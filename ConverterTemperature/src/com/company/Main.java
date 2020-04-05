package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        KelvinConverter kelvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите температуру в градусах по цельсию:");
            try {
                float tempC = sc.nextFloat();
                kelvinConverter.convertK(tempC);
                fahrenheitConverter.convertF(tempC);
            }catch (InputMismatchException e){
                System.err.println("Неверно введены данные!");
                System.err.println("Повторите ввод!");
            }
        }
    }
}
