package com.tms.lesson2;

import java.sql.SQLOutput;

public class Condition {

    public static void main(String[] args)
    {
        int value=10;
        String text="name";

        switch (text){
            case "age":
                System.out.println("AGE");

            case "name":
                System.out.println("NAME");
                System.out.println("NAME2");
                break;

            default:
                System.out.println("DEFAULT");
        }
        System.out.println("Exit");
    }
}
