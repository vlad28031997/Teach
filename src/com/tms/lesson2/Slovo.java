package com.tms.lesson2;

import java.util.Scanner;

public class Slovo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите слово:");
        String slovo=input.nextLine();


        while (!slovo.equals("exit")){
            System.out.println("Введите слово:");
            slovo=input.nextLine();
        }
System.out.println("Закончил");



    }
}
