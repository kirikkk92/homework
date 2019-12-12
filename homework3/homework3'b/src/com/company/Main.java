package com.company;

public class Main {
// исправлен вложенный цикл
    public static void main(String[] args) {
    double [] arr = {-1,55,9,4,3,0};
    arr  = min (arr);
    }
    public static double [] min (double []a) {
        double min = a[0];
        for (int i = 0; i < a.length -1; i++) {
            if (min > a[i+1])
            min = a[i+1];
        }System.out.println(min);
        return a;
    }
}

