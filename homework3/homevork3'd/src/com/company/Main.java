package com.company;

public class Main {

    public static void main(String[] args) {

        int r = byteConverter(1, "kb");
    }

    public static int byteConverter(int m, String res) {

        int result = 0;
        if (res == "kb") {
             result = 1024 * m;
            System.out.print("In ");
            System.out.print(m);
            System.out.print(" МВ ");
            System.out.print(result);
            System.out.println(" kbyte.");
        } else if (res == "b") {
            result = 1048576 * m;
            System.out.print("In ");
            System.out.print(m);
            System.out.print(" МВ ");
            System.out.print(result);
            System.out.println(" byte.");
        } else
           System.out.println("Error.The value is not set correctly.");
        return result;
    }
}