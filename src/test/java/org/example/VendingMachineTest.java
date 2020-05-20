package org.example;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class VendingMachineTest {
    VendingMachine VendingMachine1;


@Before
public void setup() {
    VendingMachine1 = new VendingMachine();
    VendingMachine1.setMoneyPool(0);
    VendingMachine1.stockMachine();
}

@Test
public void testAddCurrency_correctAmount() {
    int expectedResult = 100;
    VendingMachine1.addCurrency(100);
    assertEquals(expectedResult, VendingMachine1.getMoneyPool(), 0);
}

@Test
public void testAddCurrency_wrongAmount() {
    int expectedResult = 0;
    VendingMachine1.addCurrency(150);
    assertEquals(expectedResult, VendingMachine1.getMoneyPool(), 0);

}

@Test
public void testGetBalance() {
    int expectedResult = 100;
    VendingMachine1.setMoneyPool(100);
    assertEquals(expectedResult,VendingMachine1.getBalance(), 0);
}

@Test
public void testEndSession() {
    VendingMachine1.setMoneyPool(100);
    int expectedResult = 100;
    VendingMachine1.endSession();
    assertEquals(VendingMachine1.getChange(), expectedResult, 0);
    assertNotEquals(VendingMachine1.getMoneyPool(), expectedResult, 0);

}

@Test
public void testProductRequest() {
    VendingMachine1.setMoneyPool(20);
    int expectedResult = 5;
    VendingMachine1.productRequest(1);
    assertEquals(expectedResult, VendingMachine1.getMoneyPool());
}


@Test
public void testProductRequestNotEnoughMoney() {
    VendingMachine1.setMoneyPool(20);
    int expectedResult = 20;
    VendingMachine1.productRequest(4);
    assertEquals(expectedResult, VendingMachine1.getMoneyPool());
}

@Test
public void testGetProducts() {
    List result = VendingMachine1.getProducts();
    assertEquals(result.size(), VendingMachine1.getMachineContentLenght());
    assertTrue(result.toString().contains("Banana"));
 }

 @Test
public void testProductInformation() {
    String result = VendingMachine1.getDescription(4);
     assertTrue(result.contains("Banana"));
     assertTrue(result.contains("30"));
     assertTrue(result.contains("180"));

}
 }