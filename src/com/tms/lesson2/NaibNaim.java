package com.tms.lesson2;

public class NaibNaim {
    public static void main(String[] args) {
       int[] arr={15,2,12,4,5};
       int max=arr[0];
       int min=arr[0];
for(int i=0;i<arr.length;i++){
    if (arr[i]>max){
        max=arr[i];
    }
    if (arr[i]<min){
        min=arr[i];
    }
}
System.out.println("MAX="+max);
System.out.println("MIN="+min);


    }
}
