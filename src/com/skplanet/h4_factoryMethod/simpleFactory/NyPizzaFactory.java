package com.skplanet.h4_factoryMethod.simpleFactory;

import java.util.Objects;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class NyPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) { // static으로 만들수도 있음
        Pizza pizza = null;
        if(Objects.equals(type,"cheese")) {
            pizza = new NyStyleCheesePizza();
        } else if(Objects.equals(type, "veggie")) {
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }
}
