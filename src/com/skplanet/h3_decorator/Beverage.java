package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public abstract class Beverage {
    protected String description = "제목없음";

    protected  String getDescription() {
        return description;
    }
    public void desc() {
        System.out.println(getDescription() + ", cost = " + cost());
    }
    public abstract int cost();
//    {
//        int defaultCost = 2000;
//
//        return defaultCost;
//    }

}
