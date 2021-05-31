package com.example.springwebmvc.model;

public class Jedi {

    public  String name;
    public  String lastName;

    public Jedi(String name, String lastName) {
        this.name=name;
        this.lastName=lastName;
    }

    public Jedi(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
}
