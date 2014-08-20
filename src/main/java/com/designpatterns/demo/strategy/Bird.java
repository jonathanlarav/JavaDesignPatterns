package com.designpatterns.demo.strategy;

public class Bird extends Animal{

    public Bird() {
        flyingType = new ItFlys();
    }
}
