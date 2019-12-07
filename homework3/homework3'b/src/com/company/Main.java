package com.company;

public class Main {

    public static void main(String[] args) {
    double [] arr = {47,55,9.-4,3,0};
    arr  = min (arr);
    System.out.println(arr[0]);
    }
    public static double[] min (double []a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    double buf = a[i];
                    a[i] = a[j];
                    a[j] = buf;
                }
            }

        }return a;
    }
}

