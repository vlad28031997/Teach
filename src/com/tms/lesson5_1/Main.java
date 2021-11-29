package com.tms.lesson5_1;

public class Main {

    public static void main(String[] args) {

        Employee worker1 = new Worker(new Person("Ivan", "Ivanovich"), Prof.WORKER, 5);
        Employee worker2 = new Worker(new Person("Michail", "Ivanovich"), Prof.WORKER, 4);
        Employee worker3 = new Worker(new Person("Petr", "Ivanovich"), Prof.WORKER, 1);
        Director director1 = new Director(new Person("Sidr", "Ivanovich"), Prof.DIRECTOR, 8);
        Director director2 = new Director(new Person("Peter", "Parker"), Prof.DIRECTOR, 7);


        director1.addWorker(worker1);
        director1.addWorker(worker2);
        director2.addWorker(worker3);
        director1.addWorker(director2);


        Searcher searcher=new SearcherImpl();
        searcher.findByName(director2,"Petr");


    }
}

