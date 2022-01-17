package com.tms.lesson7;

public class User implements Comparable {
    private String name;
    private String sex;
    private int age;

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (!name.equals(user.name)) return false;
        return sex.equals(user.sex);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + age;
        return result;
    }
    @Override
    public int compareTo(Object o) {
        User out=(User) o;
        if (age!=out.age) {
            return age- out.age;
        }
        else return name.charAt(0)-out.name.charAt(0);
    }
}
