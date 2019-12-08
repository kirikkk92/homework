package com.company;

public class Main {

    public static void main(String[] args) {
        double a = sqRoots(1,2,1);

    }
    public static double sqRoots (double a, double b,double c) {
        double D = 0;
        double x1;
        double x2;
        D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Корней нет.Дискриминант < 0.");
        }else if ( D == 0) {
            x1 = -b / (2 * a);
            System.out.print("Корнем квадратного уравнения является ");
            System.out.println(x1);
        }else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.print("Корнями квадратного уравнения являются ");
            System.out.print(x1);
            System.out.print(" и ");
            System.out.print(x2);
        }return a;
    }

}
