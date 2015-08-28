package com.pathashala.sales;

public class Item {
    private String itemName;

    public Item(String item) {
        itemName = item;
    }

    public double computeSalesTax() {
        if(itemName.equalsIgnoreCase("Headache pills"));
           return 0.0;
    }
}
