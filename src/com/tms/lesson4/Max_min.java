package com.tms.lesson4;

public class Max_min {
    public static void main(String[] args) {
        int[] a=new int[]{1000,2,3,4,22,14,0,-500};
        int max=a[0];
        int min=a[0];

        for (int i=0; i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            }
        System.out.println(max+min);
    }
}
