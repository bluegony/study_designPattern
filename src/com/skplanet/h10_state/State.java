package com.skplanet.h10_state;

/**
 * Created by 1000773 on 2017. 10. 12..
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
