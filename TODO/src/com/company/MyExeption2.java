package com.company;

public class MyExeption2 extends Exception {
    public MyExeption2 (){
        super();
    }
    public String getMessage () {
        return "Не верно выбрана задача!\nПовторите ввод";
    }
}
