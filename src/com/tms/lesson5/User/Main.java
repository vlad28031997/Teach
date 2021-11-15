package com.tms.lesson5.User;

import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        User user1=new User("Vlad","Kovale",24,Sex.men, new Adress("m","v",5));

        System.out.println(user1.getNameSurname());
        user1.ageUp();
        System.out.println(user1.allInf());
user1.setSurname("Vladislow");
        System.out.println(user1.allInf());

        System.out.println(user1.toString());

    }

}
