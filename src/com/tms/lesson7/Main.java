package com.tms.lesson7;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<User> users=new TreeSet<>();


        User user1=new User("Ivan","men",15);
        User user2=new User("Petr","men",50);
        User user3=new User("Tanya","women",26);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);


    }
}
