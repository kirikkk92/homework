package com.company;

public class MinMax {
    public int[] arr;

    public void min(int[] arr){
        this.arr = arr;
        int i =0;
        for(int j =i+1;j<arr.length-1;j++){
            if (arr[i]<arr[j]){
            }else{
                i=j;
                continue;
            }
        }
        System.out.println("min = " + arr[i]);
    }
    public void max(int[] arr){
        this.arr = arr;
        int i =0;
        for(int j =i+1;j<arr.length-1;j++){
            if (arr[i]>arr[j]){
            }else{
                i=j;
                continue;
            }
        }
        System.out.println("max = " + arr[i]);
    }
    public void average(int[] arr){
        this.arr=arr;

    }
}
