package com.example.los_maguey_android;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    MenuItem menuItem;
    static int globalOrderNumber = 1;
    int orderNumber;
    List<String> modifications;

    public Order(MenuItem item)
    {
        this.menuItem = menuItem;
        this.modifications = new ArrayList();
        this.orderNumber = globalOrderNumber;
        this.globalOrderNumber++;
    }

    public void addModification(String modification)
    {
            this.modifications.add(modification);
    }

    public void clearModifications()
    {
        this.modifications.clear();
    }

    public List<String> getModifications()
    {
        return this.modifications;
    }
}
