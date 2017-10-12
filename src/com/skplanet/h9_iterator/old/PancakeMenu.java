package com.skplanet.h9_iterator.old;

import java.util.ArrayList;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
public class PancakeMenu {
    ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();
        addItem("달걀 팬케이크");
        addItem("소시지 팬케이크");
    }

    public void addItem(String name) {
        MenuItem menuItem = new MenuItem(name);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
