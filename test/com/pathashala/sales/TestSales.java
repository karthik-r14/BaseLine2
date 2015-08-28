package com.pathashala.sales;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSales {

    @Test
    public void shouldHaveSalesTaxZeroIfItemIsAMedicalProduct() {
        Item item = new Item("Headache pills", 9.75);

        assertEquals(0.0, item.computeSalesTax(), 0.001);
    }
}
