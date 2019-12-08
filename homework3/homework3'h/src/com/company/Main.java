package com.company;

public class Main {

    public static void main(String[] args) {
        int s = showTime(999);
    }
    public static int showTime (int s) {
        int h = 0;
        int m = 0;
        if (s >= 3600) {
            h = s / 3600;
            m = (s % 3600) / 60;
            s = s - (h * 3600) - (m * 60);
            if (h <10) {
                System.out.print("0");
                System.out.print(h);}
            else System.out.print(h);
            System.out.print(":");
            if (m < 10) {
                System.out.print("0");
                System.out.print(m);}
            else System.out.print(m);
            System.out.print(":");
            if (s < 10) {
                System.out.print("0");
                System.out.print(s);}
            else System.out.print(s);
        }else if ((s >= 60) & (s < 3600)) {
            m = s / 60;
            s = s % 60;
            System.out.print("00:");
            if (m < 10) {
            System.out.print("0");
            System.out.print(m);}
            else System.out.print(m);
            System.out.print(":");
            if (s < 10) {
            System.out.print("0");
            System.out.print(s);}
            else System.out.print(s);
        }else if ((s > 0) & (s < 60)) {
            System.out.print("00:00");
            if (s < 10) {
                System.out.print(":0");
                System.out.print(s);}
            else {System.out.print(":");
                System.out.print(s);
            }
        }
        else System.out.println("Неверно заданно значение");
        return s;
    }
}
