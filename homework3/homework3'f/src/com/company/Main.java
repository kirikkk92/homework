package com.company;

public class Main {

    public static void main(String[] args) {
        int numb = isPrime(577);

    }
    public static int isPrime (int numb) {
        boolean prime = true;
        for (int i =2;i <= numb / 2 ;i++) {
            if (numb % i == 0) {
                prime = false;
                break;
            }
        }System.out.println (prime);
        return  numb;
    }
}
