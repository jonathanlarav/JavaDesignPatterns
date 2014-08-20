package com.designpatterns.demo.strategy;

public interface Fly {

    String fly();

}

class ItFlys implements Fly {

    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Fly {

    @Override
    public String fly() {
        return "I can't Fly";
    }
}