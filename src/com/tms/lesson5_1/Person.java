package com.tms.lesson5_1;

public class Person {
    private String name;
    private String secondname;


    public Person(String name, String secondname) {
        this.name = name;
        this.secondname = secondname;
    }

    public String toString(){
        return ("имя "+ name+" фамилия "+ secondname);
    }

    public String getAllName(){
        return getName()+getSecondname();
    }

    public String getName() {
        return name;
    }
    private String getSecondname() {
        return secondname;
    }


}
