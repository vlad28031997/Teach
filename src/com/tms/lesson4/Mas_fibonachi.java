package com.tms.lesson4;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;

public class Mas_fibonachi {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Введите длину массива :");
        int n=Integer.parseInt(input.nextLine());

        int[] mass=new int[n];
        mass[1]=1;
        mass[0]=0;

        for (int i=1; i< mass.length-1;i++) {
            mass[i + 1] = mass[i] + mass[i - 1];

        }
        for (int i=0; i< mass.length;i++) {
            System.out.println(mass[i]);

        }

    }
}
