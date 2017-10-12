package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public int cost() {
        return 500+beverage.cost();
    }
}
