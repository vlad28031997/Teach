package com.tms.lesson1.primitives;

public class Razbiv {

    public static void main(String[] arg){
        int value=100;
        int tsch=value/1000;
        int sot=value/100%10;
        int des=value/10%10;
        int ed=value%10;
        System.out.println("тысяч-"+tsch+" сотен-"+sot+" десятков-"+des+" единиц"+ed );

    }
}
