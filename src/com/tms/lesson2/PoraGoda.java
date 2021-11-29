package com.tms.lesson2;

import java.util.Scanner;

public class PoraGoda {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Введите месяц:");
        String month=input.nextLine();

        switch (month){
            case "январь":
            case "декабрь":
            case "февраль":
                System.out.println("Зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("неверное значение");




        }

    }
}
