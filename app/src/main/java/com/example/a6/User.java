package com.example.a6;

public class User {

    private int icon;
    private String name, age;

    public User(int icon, String name, String age) {
        this.icon = icon;
        this.name = name;
        this.age = age;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
