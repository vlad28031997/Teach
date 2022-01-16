package com.tms.lesson5.User;

import javax.sound.midi.ShortMessage;

public class Adress {
    private String country;
    private String city;
    private int house;

    public Adress(String country, String city, int house) {
        this.country = country;
        this.city = city;
        this.house = house;
    }

    public String getAdress() {
        return country+" "+city+" "+ house;
    }

    public String getCity() {
        return city;
    }

    public int getHouse() {
        return house;
    }
}
