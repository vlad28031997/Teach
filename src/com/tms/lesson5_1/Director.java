package com.tms.lesson5_1;

public class Director extends Employee {

    private int currWorker;
    Prof prof;
    int time;

    public int getCurrWorker() {
        return currWorker;
    }

    public Director(Prof prof, int time) {
        super(prof, time);
    }

    public void addWorker(){

    }
    @Override
    public int salary(){
        return 1000*prof.getKof()*this.time*this.getCurrWorker();
    }

    //Задаю должность
    public void newProf(Prof prof) {
      this.prof=prof;
    }


}
