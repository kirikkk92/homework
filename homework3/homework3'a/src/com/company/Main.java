package com.company;

public class Main {

    public static void main(String[] args) {
        int a [] = {10,58,69,32,1,-2};
       int result =  average(a);
       System.out.print("Среднее значение элементов массива a[] ");
       System.out.print("= ");
       System.out.println(result);
    }
    public static int average (int [] arr){
        int sum = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        res  =  sum / arr.length;
        return res;
    }
}
