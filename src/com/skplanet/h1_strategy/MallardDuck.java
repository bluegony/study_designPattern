package com.skplanet.h1_strategy;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
    }
    public void display() {

        System.out.println("I am a MallardDuck");
    }
}
