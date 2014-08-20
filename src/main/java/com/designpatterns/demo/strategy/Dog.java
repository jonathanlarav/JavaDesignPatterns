package com.designpatterns.demo.strategy;

public class Dog extends Animal{

    public Dog() {
        flyingType = new CantFly();
    }
}
