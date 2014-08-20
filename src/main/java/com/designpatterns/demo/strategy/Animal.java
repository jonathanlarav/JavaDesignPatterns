package com.designpatterns.demo.strategy;

public class Animal {

    protected Fly flyingType;

    public void setFlyingAbility(Fly flyingType) {
        this.flyingType = flyingType;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

}
