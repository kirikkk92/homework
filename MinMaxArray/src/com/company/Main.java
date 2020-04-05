package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for(int i =0;i<=arr.length-1;i++){
            arr[i]= random.nextInt(101);
            System.out.print(arr[i]+" ");
        }
        /*Arrays.sort(arr);
        System.out.println("Минимальное значение в заданном массиве = " + arr[0]);
        System.out.println("Максмиальное значение в заданном массиве = " + arr[arr.length-1]);
        System.out.println("Среднее значение в заданном массиве = " + arr[(arr.length-1)/2]);*/


        //Сортировка пузырьком
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    continue;
                }else{
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(" ");
        for(int y:arr){
            System.out.print(y+" ");
        }
        System.out.println(" ");
        System.out.println("Минимальное значение в заданном массиве = " + arr[0]);
        System.out.println("Максмиальное значение в заданном массиве = " + arr[arr.length-1]);
        System.out.println("Среднее значение в заданном массиве = " + arr[(arr.length-1)/2]);
        }
    }
