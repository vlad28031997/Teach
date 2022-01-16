package com.tms.lesson5.User;

public class User {
    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private Adress adress;


    public User(){
    this("Ivan","Ohlob");
    }

    public User(String name,String surname) {
        this(name,surname, 28, Sex.women, new Adress("M","V",5));

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User(String name, String surname, int age, Sex sex,Adress adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.adress=adress;

    }

    private String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }

    private int getAge() {
        return age;
    }

    private Sex getSex() {
        return sex;
    }

    @Deprecated
    public String getNameSurname() {
        return getName()+" "+getSurname();
    }

public void ageUp(){
        this.age++;
        }

        public String allInf(){
        return getSurname()+" "+getName()+" "+getAge()+" "+getSex()+ adress.getAdress();
        }



    
    public String toString() {
        return super.toString()+"перегруженный";
    }




}
