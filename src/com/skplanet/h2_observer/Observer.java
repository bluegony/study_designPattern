package com.skplanet.h2_observer;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
