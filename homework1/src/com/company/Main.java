package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int year =1550;
        if (year < 1 || year > 3000) System.out.println("Введен неверный год");
        else if ((year%400)==0 ) System.out.println(year + " " + "год является високосным годом!");
        else if ((year%100)==0) System.out.println(year + " " + "год является невисокосным годом!");
        else if((year%4)==0) System.out.println(year + " " + "год является високосным годом!");
        else System.out.println(year + " " + "год является невисокосным годом!");

    }
}
