package com.company;

public class Main {

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.print();
        System.out.println("");
        try {
            System.out.println(list.get(9));
        } catch (MyExeption myExeption) {
            System.err.println(myExeption.getMessage());
        }
        list.add(12);
        list.add(14);
        list.print();
        try {
            list.remove(1);
        } catch (MyExeption myExeption) {
            System.err.println(myExeption.getMessage());
        }
        try {
            list.remove(9);
        } catch (MyExeption myExeption) {
            System.err.println(myExeption.getMessage());
        }
        list.print();


    }
}
