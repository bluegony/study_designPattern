package com.skplanet.h1_strategy;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("이 오리는 소리를 내지 않습니다.");

    }
}
