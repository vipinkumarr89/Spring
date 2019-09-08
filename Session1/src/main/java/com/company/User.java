package com.company;

public class User {
    Car car;

    public Car getCar() {
        return car;
    }

    //Dependancy injection using Setter method
//    public void setCar(Car car) {
//        this.car = car;
//    }

    //Dependancy injection using Constructor
    public User(Car car) {
        this.car = car;
    }
}
