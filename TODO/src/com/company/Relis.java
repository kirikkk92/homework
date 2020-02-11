package com.company;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Relis {
    static HashMap<Object, HashMap<Object, Enum>> map = new HashMap<>();//коллекция которая хранит <дату,<задачу,статус задачи>>
    static HashMap<Object, Enum> map2 = new HashMap<>();// коллекция которая хранит <задачу,статус задачи>
    static Tasks task = new Tasks();//объект задачи
    static Data data = new Data();//объект статуса


    public static void addTasks() throws MyExeption, MyExeption2 {

        task.status = Status.NotCompleted;// устанавливаем статус задачи по умолчанию
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате \"DD/MM/YYYY\":");
        data.date = sc.nextLine();

        Proverka prov = new Proverka(data.date);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите задачу:");
        task.description = sc2.nextLine();
        if (map.containsKey(data.date)) { //проверяем,если map уже хранит введенную дату
            HashMap<Object, Enum> map2 = map.get(data.date); //то записываем на эту дату еще одну задачу
            map2.put(task.description, task.status);
            map.put(data.date, map2);
        } else {
            map.put(data.date, new HashMap<Object, Enum>());//иначе создаем новую
            HashMap<Object, Enum> map2 = map.get(data.date);
            if (!map2.containsKey(data.date)) {
                map2.put(task.description, task.status);
            }
        }
        /*Set set = map.entrySet();
        System.out.println("");
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }*/
        try {
            FileWriter fw = new FileWriter("saveMap.txt",false);
            fw.write (String.valueOf(map));
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        public static void chooseTask() throws MyExeption, MyExeption2, MyExeption3 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату для редакторования задач");
        data.date = sc.nextLine();
        Proverka proverka = new Proverka(data.date);
        Proverka proverka1 = new Proverka(data.date,map);

        System.out.println("Выберете задачу для редактирования:");
        Object[] keyListArray = map.get(data.date).keySet().toArray();//записываем все задачи в массив
        for (int i = 0, j = 1; i <= keyListArray.length - 1; i++, j++) { //выводим весь список на экран
            System.out.print(j);
            System.out.print(". ");
            System.out.println(keyListArray[i]);
        }
        Scanner sc2 = new Scanner(System.in);
        int chooseTask = sc2.nextInt();
        if (chooseTask > keyListArray.length | chooseTask < 0) {// проверяем корректный ввод с клавиатуры
            throw new MyExeption3();
        }
        Scanner sc3 = new Scanner(System.in);
            System.out.println("Меню 2");
            System.out.println("1.Изменить описание");
            System.out.println("2.Удалить");
            System.out.println("3.Пометить как \"выполненое\"");
            System.out.println("4.Пометить как \"не выполненое\"");
            System.out.println("5.Отмена");
            int menu = sc3.nextInt();
            switch (menu) {
                case 1:
                    map.get(data.date).remove(keyListArray[chooseTask - 1]);//находим и удаляем выбранную задачу из коллекции
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Введите новое описание задачи:");
                    task.description = sc4.nextLine();
                    map2 = (map.get(data.date)); //находим значение по выбранной дате и записываем в map2
                    map2.put(task.description, task.status);//дозаписываем к коллекции map2 новое описание задачи
                    System.out.println("Задача изменена!");
                    try {
                        FileWriter fw = new FileWriter("saveMap.txt");
                        fw.write(String.valueOf(map));
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
                    return;
                default:
                    System.out.println("Неверно выбран пункт меню!");
                    System.out.println("Повторите ввод!");
            }
        }


    public static void getListTask() throws MyExeption2, MyExeption {
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
                long dateNowL = new Date().getTime();//получаем кол-во миллисикунд в данный момент
                String dateNo = df.format(dateNowL);//форматируем в строковое значение для поиска в map
                if (map.containsKey(dateNo)) {
                Set set = map.get(dateNo).entrySet();
                System.out.println("На сегодня у Вас запланированны следующие дела: ");
                for (Object o : set) {
                    Map.Entry m = (Map.Entry) o;
                    System.out.print(m.getKey());
                    System.out.print("; Статус задачи: ");
                    System.out.println(m.getValue());
                }

                }
                System.out.println("На сегодня ничего не запланированно!");
                break;
            case 2:
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/y");
                Date dateNow = new Date();
                long dateNowLong = dateNow.getTime();//находим время в миллисикундах на данный момент
                String dateNowStr = df2.format(dateNowLong);//форматируем в нужный нам формат
                SimpleDateFormat df3 = new SimpleDateFormat("u");
                int week = Integer.parseInt(df3.format(dateNowLong));//находим день недели(1-7)
                System.out.println("На эту неделю у вас запланированны следующие задачи: ");
                for (;week < 8;week++) { // выводим на экран зачи до конца недели

                    if (map.containsKey(dateNowStr)) { //проверяем есть ли задача на данную дату
                        System.out.print(dateNowStr);
                        System.out.println(": ");
                        Set set = map.get(dateNowStr).entrySet();//записываем ее в сет
                        for (Object o : set) {//выводим на экран
                            Map.Entry m = (Map.Entry) o;
                            System.out.print(m.getKey());
                            System.out.print(":");
                            System.out.println(m.getValue());
                        }
                    }
                        dateNowLong += 86400000; //есди нет, то находим следующий день и повторяем цикл
                        dateNowStr = df2.format(dateNowLong);
                }
                break;
            case 3:
                SimpleDateFormat df4 = new SimpleDateFormat("dd/MM/y");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите дату в формате \"DD/MM/YYYY\"");
                String data = sc2.nextLine();

               Proverka proverka = new Proverka(data);
               Proverka proverka2 = new Proverka(data,map);

                Object[] dataMass = map.get(data).entrySet().toArray();//запиываем в массив задачи
                System.out.print("На ");
                System.out.print(data);
                System.out.println("у вас запланированно следующее:");
                for (int i = 0, j = 1; i < dataMass.length; i++, j++) {//выводим их на экран
                    System.out.print(j);
                    System.out.print(". ");
                    System.out.println(dataMass[i]);
                }
                break;
            case 4:
                System.out.println("Вот ваш весь список дел:");
                Set set2 = map.entrySet();
                //Set set3 = map2.entrySet();
                if (map.isEmpty()) {
                    System.out.println("Список пуст!");
                }else {
                    for (Object o : set2) {
                        Map.Entry m = (Map.Entry) o;
                    System.out.print(m.getKey());
                    System.out.println(": ");

                    System.out.println(m.getValue());
                    }
                }
                break;
            }
        }
    }



