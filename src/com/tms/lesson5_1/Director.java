package com.tms.lesson5_1;

import java.util.Arrays;

public class Director extends Employee implements Searcher {


    public Employee[] getEmployees() {
        return Arrays.copyOf(employees,10);
             }

    private    Employee[] employees = new Employee[10];

    public int getCurrWorker() {
        return employees.length;
    }

    public Director(Person person, Prof prof, int time) {
        super(person, prof, time);
    }

    public void findByName(Director director, String name) {

        Employee[] mass;
        int i=0;
        mass=director.getEmployees();
        while (mass[i]!=null) {
            if (mass[i].person.getName() != name) {
                i++;
            } else if (mass[i].person.getName() == name) {
                System.out.println("сотрудник " + name + " находится в подчинение у " + director.toString());
                return;
            }
        }
    }

    public void addWorker(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    @Override
    public int salary() {
        int count=0;
        for (int i=0;i<employees.length; i++){
            if (employees[i]!=null) {
                count++;
            }
        }
        return 1000 * this.time * count;
    }

    //Задаю должность
    public void newProf(Prof prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Данные директора{" +
                 person +
                " должность"+ prof+
                ", ЗП=" + salary() +
                ", стаж " + time +
                " лет, работники=" + Arrays.toString(employees) +
                '}';
    }

}
