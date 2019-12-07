package com.company;

public class Main {

    public static void main(String[] args) {
        int a = firstEven(1,3,19,7,9,12,-20);
    }
    public static  int firstEven (int...a) {
        int aEven = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                aEven = a[i];
                System.out.println("Первым четным числом является ");
                System.out.println(aEven);
                break;
            }

        }
        return aEven;
    }
}
