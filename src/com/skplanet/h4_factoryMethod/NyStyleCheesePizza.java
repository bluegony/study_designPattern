package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class NyStyleCheesePizza extends Pizza {
    @Override
    void prepare() {
        name = "ny style cheese pizza";
        System.out.println("preparing " + name);

    }


}
