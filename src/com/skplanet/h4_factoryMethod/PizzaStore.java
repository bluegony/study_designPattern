package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String type);


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
