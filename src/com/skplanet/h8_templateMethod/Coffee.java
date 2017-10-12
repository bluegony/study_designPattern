package com.skplanet.h8_templateMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("원두를 갈아 에스프레소 머신으로 추출합니다.");
    }

    @Override
    void addCondiments() {
        System.out.println("두유를 추가합니다.");


    }
}
