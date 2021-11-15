package com.tms.lesson2;

public class Sort {
    public static void main(String[] args) {
        int[] arr={100,9,-3,1,0};
        int zam=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                  zam=arr[i];
                  arr[i]=arr[j];
                  arr[j]=zam;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }




}
