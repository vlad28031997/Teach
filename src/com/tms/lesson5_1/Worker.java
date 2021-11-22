package com.tms.lesson5_1;

public class Worker extends Employee {
Prof prof;
int time;


    public Worker(Prof prof, int time) {
        super(prof, time);
    }
//Задаю должность
    public void newProf(Prof prof) {
        this.prof=prof;
    }
}
