package com.tms.lesson5_1;

public abstract class Employee {

    private Prof prof;
    private int time;

    public Employee(Prof prof, int time) {
        this.prof = prof;
        this.time = time;
    }

    public int salary(){
        return 1000*prof.getKof()*this.time;
}

public abstract class newProf {
}


    }

