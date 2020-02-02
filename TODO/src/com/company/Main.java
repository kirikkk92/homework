package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Relis reliss = new Relis();


        Scanner sc = new Scanner(System.in);
        boolean bb;
        while (bb = true) {
            System.out.println("Главное меню");
            System.out.println("1. Добавить задание");
            System.out.println("2. Выбрать задание");
            System.out.println("3. Показать список дел");
            System.out.println("4. Завершить работу");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    try {
                        reliss.addTasks();
                    } catch (MyExeption myExeption) {
                        System.err.println(myExeption.getMessage());
                    }
                    break;
                case 2:
                    try {
                        reliss.chooseTask();
                    } catch (MyExeption myExeption) {
                        System.err.println(myExeption.getMessage());
                    }
                    break;
                case 3:
                    reliss.getListTask();
                    break;
                case 4:
                    System.out.println("Хорошего Вам дня!");
                    bb = false;
                    break;
            }

        }
    }
}
