package com.example.los_maguey_android;

import java.util.ArrayList;
import java.util.List;

public class OrdersList
{
    List<Order> orders;

    public OrdersList()
    {
        this.orders = new ArrayList();
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }
}
