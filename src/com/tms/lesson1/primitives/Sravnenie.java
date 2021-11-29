package com.tms.lesson1.primitives;

public class Sravnenie {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = -100;
        if (value1 > value2) {
            System.out.println("Первое число больше");
        }
        else if (value1 < value2) {
            System.out.println("Второе число больше");
        }
        else {
            System.out.println("Равны");
        }

    }
}
