package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

    /**
     * abstract factory
     */

    @Override
    public void createDough() {
        System.out.println("create ny dough");
    }

    @Override
    public void createSauce() {
        System.out.println("create ny sauce ");

    }
}
