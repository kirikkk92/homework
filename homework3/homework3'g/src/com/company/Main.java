package com.company;

public class Main {

    public static void main(String[] args) {
        int a = sumDigits(12340567);

    }
    public static int sumDigits (int a) {
        int sum = 0;
        if (a < 0)
            System.out.println("Введите положительное число");
        else {
            while ( a > 0) {
          sum = sum + a % 10;
          a = a / 10;
            }
        System.out.println(sum);
        }
        return sum;
    }

}
