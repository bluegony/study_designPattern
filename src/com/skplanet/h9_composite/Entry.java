package com.skplanet.h9_composite;

/**
 * Created by 1000773 on 2017. 9. 26..
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    protected void printList() {
        printList("/");
    }
    protected abstract void printList(String prefix);
    public String toString() {
        return getName() + "(" + getSize()+")";
    }
    public Entry add(Entry entry) {
        throw new RuntimeException();
    }
}
