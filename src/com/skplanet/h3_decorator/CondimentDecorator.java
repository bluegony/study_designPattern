package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }


    public abstract String getDescription();
}
