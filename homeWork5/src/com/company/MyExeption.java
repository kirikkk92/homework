package com.company;

public class MyExeption extends Exception {
    public MyExeption () {
        super();
    }
        public String getMessage () {
        return "Ошибка ввода индекса";
        }
}
