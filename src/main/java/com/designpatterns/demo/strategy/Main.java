package com.designpatterns.demo.strategy;

public class Main {

    public static void main(String ... args) {
        Animal sparky = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());

        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly());

    }

}
