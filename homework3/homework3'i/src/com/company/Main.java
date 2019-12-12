package com.company;

public class Main {
//исправлен вложенный цикл
    public static void main(String[] args) {
        int [] arr = {-3,-2,3,4,5,6,7,89,-100,};
        arr  = isSorted(arr);
    }
    public static int []  isSorted  (int [] arr ) {
        boolean sorted = true;
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) {
                sorted = false;
            }


        }System.out.print("The array is sorted: ");
        System.out.println(sorted);
        return arr;
    }
}
