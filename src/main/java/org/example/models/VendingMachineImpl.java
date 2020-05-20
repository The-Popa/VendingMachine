package org.example.models;

import java.util.List;

public interface VendingMachineImpl {
    void addCurrency(int amount);
    Product productRequest(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    List getProducts();
}
