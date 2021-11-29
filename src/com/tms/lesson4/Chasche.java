package com.tms.lesson4;

import jdk.nashorn.internal.parser.JSONParser;

public class Chasche {
    public static void main(String[] args) {
        int[] mass=new int[]{1,1,2,3,4,5,4,5,4,4,4};
        int[] mass1=new int[mass.length];

        for (int i=0;i< mass.length;i++){
                       int n=0;
            for (int j=0;j<mass.length;j++){

                if (mass[i]==mass[j]){
                    n+=1;
                }
                mass1[i]=n;


                }
        }
        int max=0;
        int indexMax=0;
        for (int i=0;i<mass.length;i++)
        {
            if (mass1[i]>max){
                indexMax=i;
                max=mass1[i];
            }
        }
        System.out.println("число "+mass[indexMax]);
        System.out.println(mass1[indexMax]+" раз");
    }
}
