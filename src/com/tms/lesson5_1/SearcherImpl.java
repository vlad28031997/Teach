package com.tms.lesson5_1;

public class SearcherImpl implements Searcher {


    @Override
    public void findByName(Director director, String name) {

        Employee[] mass;
        int i=0;
        mass=director.getEmployees();
        while (mass[i]!=null)
        {
            if (mass[i].person.getName()!=name){
                i++;
                            }
            else if (mass[i].person.getName()==name) {
                System.out.println("сотрудник " + name + " находится в подчинение у " + director.toString());
                return;
            }


        }


    }
}
