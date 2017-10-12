package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class Whip extends CondimentDecorator {
//    Beverage beverage;

    public Whip(Beverage beverage) {
        super(beverage);
//        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public int cost() {
        return 300+beverage.cost();
    }
}
