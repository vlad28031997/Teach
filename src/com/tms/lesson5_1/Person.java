package com.tms.lesson5_1;

public class Person {
    private String name;
    private String secondname;

    public Person(String name, String secondname) {
        this.name = name;
        this.secondname = secondname;
    }

    public String getAllName(){
        return getName()+getSecondname();

    }

    private String getName() {
        return name;
    }

    private String getSecondname() {
        return secondname;
    }
}
