package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String s = "ausdasdasfdfdfasdfadfnsdfdfsanf";
	    String [] arr = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
	    int i =0;
	    int counter = 0;
	    while(i!=arr.length) {
            String c = arr[i];
            for (int j = 0; j <= arr.length-1; j++) {
                if (c.equals(arr[j])){
                    counter++;
                }else{
                    continue;
                }
            }
            map.put(c,counter);
            i++;
            counter = 0;
	    }
        System.out.println("В строке \"" + s + "\" следующее количество букв:");
	    for (Map.Entry entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}
