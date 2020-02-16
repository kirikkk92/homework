package com.company;
import java.io.*;

public class Save {

    FileWriter fw;

    {
        try {
            fw = new FileWriter("saveMap.txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Save(String data,String description,Enum status) {
        try {
            fw.write (data + "@" + description+ "@" +status+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Save(String s,String removDescr,String newDescr){
        s.replace(removDescr,newDescr);
        try {
            fw.write(s);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
