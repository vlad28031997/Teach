package com.tms.lesson2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите число1:");
        String slovo1=input.nextLine();
        System.out.println("Введите число2:");
        String slovo2=input.nextLine();

        int num1=Integer.parseInt(slovo1);

        int num2=Integer.parseInt(slovo2);
        int sum=0;

        for (;num1<=num2 ; num1++){
sum+=num1;
        }

        System.out.println(sum);






    }
}
