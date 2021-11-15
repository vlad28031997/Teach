package com.tms.lesson5.Mass;

public class Mass {

    int[] arr;


    public Mass(int[] arr)
    {
        this.arr = arr;
    }

    public int max() {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void sort() {
        int zam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    zam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = zam;
                }
            }
        }
    }


    public void write() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int search(int n) {
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                num= i + 1;
            }
        }
        return num;
    }


}





