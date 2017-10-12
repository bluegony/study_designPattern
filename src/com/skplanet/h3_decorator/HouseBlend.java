package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스블렌드";
    }

    @Override
    public int cost() {
        return 990;
    }
}
