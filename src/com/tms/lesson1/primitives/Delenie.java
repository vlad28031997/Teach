package com.tms.lesson1.primitives;

public class Delenie
{
    public static void main(String[] args){
        int value1=800;
        int value2=800;
        boolean result= (value1%value2)==0;
        if (result==true)
        {
            System.out.println("Делятся нацело");
        }
        else {
            System.out.println("Не делятся нацело");
        }
    }
}
