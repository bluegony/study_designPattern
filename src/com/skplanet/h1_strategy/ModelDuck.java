package com.skplanet.h1_strategy;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new MuteQuack();
    }
    public void display() {

        System.out.println("I am a ModelDuck");
    }
}
