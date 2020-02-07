package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Relis {
    static HashMap<Object, HashMap<Object, Enum>> map = new HashMap<>();
    static HashMap<Object, Enum> map2 = new HashMap<>();
    static Tasks task = new Tasks();
    static Data data = new Data();


    public static void addTasks() throws MyExeption {
        task.status = Status.NotCompleted;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате \"DD/MM/YYYY\":");
        data.date = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d = df.parse(data.date);
            System.out.println(d);
            String f = df.format(d);
            System.out.println(f);
            System.out.println(data.date);
            if (!f.equals(data.date)) {
                throw new MyExeption();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите задачу:");
        task.description = sc2.nextLine();
        if (map.containsKey(data.date)) {
            HashMap<Object, Enum> map2 = map.get(data.date);
            map2.put(task.description, task.status);
            map.put(data.date, map2);
        } else {
            map.put(data.date, new HashMap<Object, Enum>());
            HashMap<Object, Enum> map2 = map.get(data.date);
            if (!map2.containsKey(data.date)) {
                map2.put(task.description, task.status);
            }
        }
            Set set = map.entrySet();
            System.out.println("");
            for (Object o : set) {
                Map.Entry m = (Map.Entry) o;
                System.out.println(m.getKey() + " " + m.getValue());
            }

    }
    public static void chooseTask() throws MyExeption {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату для редакторования задач");
        data.date = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d = df.parse(data.date);
            System.out.println(d);
            String f = df.format(d);
            System.out.println(f);
            System.out.println(data.date);
            if (!f.equals(data.date)) {
                throw new MyExeption();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Выберете задачу для редактирования:");
        Object[] keyListArray = map.get(data.date).keySet().toArray();
        for (int i = 0, j = 1; i <= keyListArray.length - 1; i++, j++) {
            System.out.print(j);
            System.out.print(". ");
            System.out.println(keyListArray[i]);
        }
        Scanner sc2 = new Scanner(System.in);
        int chooseTask = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        boolean flag = true;

            System.out.println("Меню 2");
            System.out.println("1.Изменить описание");
            System.out.println("2.Удалить");
            System.out.println("3.Пометить как \"выполненое\"");
            System.out.println("4.Пометить как \"не выполненое\"");
            System.out.println("5.Отмена");
            int menu = sc3.nextInt();
            switch (menu) {
                case 1:
                    map.get(data.date).remove(keyListArray[chooseTask - 1]);
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Введите новое описание задачи:");
                    task.description = sc4.nextLine();
                    map2 = (map.get(data.date));
                    map2.put(task.description, task.status);
                    System.out.println("Задача изменена!");
                    break;
                case 2:
                    while (true) {
                        Scanner sc5 = new Scanner(System.in);
                        System.out.println("Вы действительно хотите удалить выбранную задачу?(y/n)");
                        String answer = sc5.nextLine();
                        if (answer.equals("y")) {
                            map.get(data.date).remove(keyListArray[chooseTask - 1]);
                            System.out.println("Задача удалена!");
                            break;
                        } else if (answer.equals("n")) {
                            System.out.println("Удаление отменено!");
                            break;
                        } else
                            System.out.println("Ошибка ввода.Повторите ввод!");
                    }
                    break;
                case 3:
                    task.status = Status.Completed;
                    map.get(data.date).put(keyListArray[chooseTask - 1], task.status);
                    System.out.println("Задача отмеченна как \"выполненая\"!");
                    break;
                case 4:
                    task.status = Status.NotCompleted;
                    map.get(data.date).put(keyListArray[chooseTask - 1], task.status);
                    System.out.println("Задача отмеченна как \"не выполненная\"!");
                    break;
                case 5:
                    flag = false;
            }
        }


    public static void getListTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. На сегодня");
        System.out.println("2. На эту неделю");
        System.out.println("3. На выбранную дату");
        System.out.println("4. Весь список");
        System.out.println("5. Назад");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/y");
                long dateNowL = new Date().getTime();
                String dateNo = df.format(dateNowL);
                System.out.println(dateNo);
                System.out.println(map);
                Set set = map.get(dateNo).entrySet();
                System.out.println("На сегодня у Вас запланированны следующие дела: ");
                for (Object o : set) {
                    Map.Entry m = (Map.Entry) o;
                    System.out.print(m.getKey());
                    System.out.print("; Статус: ");
                    System.out.println(m.getValue());
                }
                break;
            case 2:
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/y");
                Date dateNowWeek = new Date();
                long dateNowStrWeek = dateNowWeek.getTime();
                String dateNext = df2.format(dateNowStrWeek);
                SimpleDateFormat df3 = new SimpleDateFormat("u");
                String week = df3.format(dateNowStrWeek);
                System.out.println(week);//
                int intWeek = Integer.parseInt(week);
                System.out.println("На эту неделю у вас запланированны следующие задачи: ");
                for (;intWeek < 8;intWeek++) {
                    System.out.println(dateNext);
                    if (map.containsKey(dateNext)) {
                        System.out.println(map.get(dateNext));
                    }
                    System.out.println("");
                    long nextDay = dateNowStrWeek + 86400000;
                    dateNext = df2.format(nextDay);
                }
                break;
            case 3:
                SimpleDateFormat df4 = new SimpleDateFormat("d/MM/y");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите дату в формате \"DD/MM/YYYY\"");
                String data = sc2.nextLine();
                Object[] dataMass = map.get(data).entrySet().toArray();
                System.out.print("На ");
                System.out.print(data);
                System.out.println("у вас запланированно следующее:");
                for (int i = 0, j = 1; i < dataMass.length; i++, j++) {
                    System.out.print(j);
                    System.out.print(". ");
                    System.out.println(dataMass[i]);
                }
                break;
            case 4:
                System.out.println("Вот ваш весь список дел");
                Set set2 = map.entrySet();
                for (Object o : set2) {
                    Map.Entry m = (Map.Entry) o;
                    System.out.print(m.getKey());
                    System.out.println(": ");
                    System.out.println(m.getValue());
                }
                break;
            }
        }
    }



