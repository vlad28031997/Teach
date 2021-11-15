package com.tms.lesson2;

import java.util.Objects;
import java.util.Scanner;

public class Bukva {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Введите букву :");
        String bukva=input.nextLine();
        if (bukva.equals("a") || bukva.equals("A"))
        {
            System.out.println("Гласная");
        }
        else if (bukva.equals("b") || bukva.equals("B"))
        {
            System.out.println("Согласная");
        }
        else if (bukva.equals("c") || bukva.equals("C"))
        {
            System.out.println("Согласная");
        }
        else if (bukva.equals("d") || bukva.equals("D"))
        {
            System.out.println("Согласная");
        }

        else if (bukva.equals("e") || bukva.equals("E"))
        {
            System.out.println("Гласная");
        }
        else {
            System.out.println("exit");
        }

        System.out.println("switch-----");

        switch (bukva){
            case "a":
            case "A":
                System.out.println("Гласная");
                break;
            case "b":
            case "B":
                System.out.println("Согласная");
                break;
            case "c":
            case "C":
                System.out.println("Согласная");
                break;
            case "d":
            case "D":
                System.out.println("Согласная");
                break;
            case "e":
            case "E":
                System.out.println("Гласная");
                break;




        }



    }
}
