package com.skplanet.h8_templateMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public abstract class Beverage {

    abstract void brew();
    abstract void addCondiments();
    void boidWater() {
        System.out.println("boiling...");
    }
    void pourICup() {
        System.out.println("pouring..");
    }
    final void make() {
        boidWater();
        brew();
        pourICup();
        addCondiments();
        System.out.println();
    }
}
