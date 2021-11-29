package com.tms.lesson2;

public class Cicle {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 90, 120};
        String[] vstrArr = {"text1", "text2", "text3"};


        for (int count = 0; count < arr.length; count++) {
            System.out.println(arr[count]);
        }
        System.out.println("exit");
        for (int el : arr) {
            System.out.println(el);
        }
        System.out.println("-------------");

        int value = 0;
do {
    System.out.println(value);
    value++;
}

        while (value < 10);
    }
}