package com.skplanet.h4_factoryMethod.simpleFactory;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class Main {
    public static void main(String[] args) {

        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
        store.orderPizza("veggie");

//        // simple factory + strategy
//        store.setFactory(new NyPizzaFactory());
//        store.orderPizza("cheese");
//        store.orderPizza("veggie");
    }
}
