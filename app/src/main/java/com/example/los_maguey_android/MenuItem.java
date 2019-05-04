package com.example.los_maguey_android;

import java.util.ArrayList;
import java.util.List;


public class MenuItem
{
    String name, tag;
    double price;

    public MenuItem(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public MenuItem(String tag, String name, double price)
    {
        this.tag = tag;
        this.name = name;
        this.price = price;
    }
}
