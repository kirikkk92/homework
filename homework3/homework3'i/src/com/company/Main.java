package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,77};
        arr  = isSorted(arr);
    }
    public static int []  isSorted  (int [] arr ) {
        boolean sorted = true;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] > arr[j]) {
                    sorted = false;
                    break;
                }
            }
        }System.out.print("The array is sorted: ");
        System.out.println(sorted);
        return arr;
    }
}
