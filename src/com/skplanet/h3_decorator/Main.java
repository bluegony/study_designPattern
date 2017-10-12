package com.skplanet.h3_decorator;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class Main {
    public static void main(String[] args) {
        Beverage es = new Espresso();
        Beverage mo = new Mocha(es);
        mo.desc();
        Beverage wi = new Whip(mo);
        wi.desc();
        Beverage ho = new HouseBlend();
        Beverage whi = new Whip(ho);
        Beverage whii = new Whip(whi);
        whii.desc();

    }
}
