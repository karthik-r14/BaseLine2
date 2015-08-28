package com.pathashala.sales;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSales {

    @Test
    public void shouldHaveSalesTaxZeroIfItemIsAMedicalProduct() {
        Item item = new Item("Headache pills", 9.75);

        assertEquals(0.0, item.computeSalesTax(), 0.001);
    }

    @Test
    public void shouldHaveSalesTaxZeroIfItemIsAFoodProduct() {
        Item item = new Item("Chocolate", 0.85);

        assertEquals(0.0, item.computeSalesTax(), 0.001);
    }
}
