package com.tms.lesson5_1;

public abstract class Employee {
    protected Person person;
    protected Prof prof;
    protected int time;

    public Employee(Person person,Prof prof, int time) {
        this.person=person;
        this.prof = prof;
        this.time = time;
    }

    public int salary(){
        return 1000*prof.getKof()*this.time;
}

public abstract class newProf {
}


    }

