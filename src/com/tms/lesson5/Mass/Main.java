package com.tms.lesson5.Mass;
public class Main {

    public static void main(String[] args) {


    int[] arr=new int[]{1,2,22,4,5,4};

    Mass arr1=new Mass(arr);
arr1.sort();
arr1.write();


        System.out.println(arr1.max());
        System.out.println(arr1.search(22));


    }

}
