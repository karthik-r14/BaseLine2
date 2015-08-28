package com.pathashala.sales;

public class Item {
    private String itemName;
    private double price;

    public Item(String item, double cost) {
        itemName = item;
        price = cost;
    }

    public double computeSalesTax() {
        if(itemName.equalsIgnoreCase("Headache pills"))
           return 0.0;
        else
           return price * 0.2;
    }
}
