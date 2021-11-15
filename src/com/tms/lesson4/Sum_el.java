package com.tms.lesson4;

public class Sum_el {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,0,100};
        int sum1=0;
        int sum2=0;
        for (int i=0;i<a.length;i++){
            if (i%2==0){
                sum1+=a[i];
            }
            else {
                sum2+=a[i];
            }

        }
        System.out.println(sum1-sum2);
    }
}
