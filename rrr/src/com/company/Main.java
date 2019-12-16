package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Philips philips = new Philips("philips", 5000f, 1000f);
        Bosh bosh = new Bosh("bosh", 10000f, 3000f);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете машину для приготовления кофе:");
            System.out.println("1. Pilips");
            System.out.println("2. Bosh");
            int menu = sc.nextInt();
            if (menu == 1) {
                while (true) {
                    System.out.println("Выберите пункт меню:");
                    System.out.println("1. Показать текущий объем воды и кофе");
                    System.out.println("2. Приготовить “Американо”");
                    System.out.println("3. Приготовить “Эспрессо”");
                    System.out.println("4. Приготовить “Двойной эспрессо”");
                    System.out.println("5. Заполнить бак с водой");
                    System.out.println("6. Заполнить бак с кофе");
                    System.out.println("7. Информация о кофемашине");
                    System.out.println("8. Выключить кофемашину");
                    int menu2 = sc.nextInt();
                    switch (menu2) {
                        case 1:
                            philips.getVolume();
                            break;
                        case 2:
                            philips.getAmericano();
                            break;
                        case 3:
                            philips.getEcpresso();
                        case 4:
                            philips.get2Ecpresso();
                            break;
                        case 5:
                            philips.addWater();
                            break;
                        case 6:
                            philips.addCoffee();
                            break;
                        case 7:
                            philips.info();
                            break;
                        case 8:
                            philips.offAutomat();
                            return;
                        default:
                            System.out.println("Неверно выбран пункт меню!");
                            System.out.println("Повторите ввод.");
                    }
                }
            } else if (menu == 2) {
                while (true) {
                    System.out.println("Выберите пункт меню:");
                    System.out.println("1. Показать текущий объем воды и кофе");
                    System.out.println("2. Приготовить “Американо”");
                    System.out.println("3. Приготовить “Эспрессо”");
                    System.out.println("4. Приготовить “Двойной эспрессо”");
                    System.out.println("5. Заполнить бак с водой");
                    System.out.println("6. Заполнить бак с кофе");
                    System.out.println("7. Информация о кофемашине");
                    System.out.println("8. Выключить кофемашину");
                    int menu2 = sc.nextInt();
                    switch (menu2) {
                        case 1:
                            bosh.getVolume();
                            break;
                        case 2:
                            bosh.getAmericano();
                            break;
                        case 3:
                            bosh.getEcpresso();
                        case 4:
                            bosh.get2Ecpresso();
                            break;
                        case 5:
                            bosh.addWater();
                            break;
                        case 6:
                            bosh.addCoffee();
                            break;
                        case 7:
                            bosh.info();
                            break;
                        case 8:
                            bosh.offAutomat();
                            return;
                        default:
                            System.out.println("Неверно выбран пункт меню!");
                            System.out.println("Повторите ввод.");

                    }
                }
            }else
                System.out.println("Неверно выбран пункт меню!");
            System.out.println("Повторите ввод");
        }
    }
}
