package com.skplanet.h2_observer;

/**
 * Created by 1000773 on 2017. 10. 10..
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
