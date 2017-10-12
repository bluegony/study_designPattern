package com.skplanet.h8_templateMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.make();

        Beverage tea = new Tea();
        tea.make();
    }
}
