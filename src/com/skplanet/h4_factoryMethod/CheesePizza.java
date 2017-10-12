package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class CheesePizza extends Pizza {

    /**
     * abstract factory
     */
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "cheese pizza";
    }

    @Override
    void prepare() {
        System.out.println("preparing " + name);
        ingredientFactory.createDough();
        ingredientFactory.createSauce();

    }
}
