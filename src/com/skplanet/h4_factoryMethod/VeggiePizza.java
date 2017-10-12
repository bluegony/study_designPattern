package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class VeggiePizza extends Pizza {

    /**
     * abstract factory
     */
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "veggie pizza";
    }

    @Override
    void prepare() {
        System.out.println("preparing " + name);
        ingredientFactory.createDough();
        ingredientFactory.createSauce();

    }
}
