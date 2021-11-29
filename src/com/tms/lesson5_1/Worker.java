package com.tms.lesson5_1;

import java.util.Arrays;

public class Worker extends Employee {



    public Worker(Person person,Prof prof, int time) {
        super(person,prof, time);
    }
//Задаю должность
    public void newProf(Prof prof) {
        this.prof=prof;
    }

    @Override
    public String toString() {
        return "Данные работника{" +
                 person +
                ", Профессия=" + prof +
                ", Работает " + time+
                " ЗП "+ salary()+
        "стаж"+time;

    }
}
