package com.company;

public class Main {

    public static void main(String[] args) {
        int [][]arr ={{-1,2,-3,4},{5,6,-7,8},{9,5,4,7,5,6,-4}};
        arr = replaceNegatives(arr);
        int i;
        int j;
        for (i = 0;i < arr.length;i++) {
            for (j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
        }

    }

    public  static  int [][] replaceNegatives (int [][] arr) {
        int i =0;
        int j = 0;
        for ( i = 0;i < arr.length;i++) {
            for ( j = 0;j< arr[i].length;j++) {
                if (arr[i][j] < 0)
                    arr[i][j] = 0;
            }
        }return arr;

    }
}
