package org.example;

import org.example.models.Drinks;
import org.example.models.VendingMachineImpl;
import org.example.models.Product;
import org.example.models.Fruits;
import org.example.models.Sweets;

import java.util.Arrays;
import java.util.List;

public class VendingMachine implements VendingMachineImpl {
    private int moneyPool;
    private int change;
    private Product[] machineContent = new Product[8];
    private int[] acceptedDenominations = {1, 5, 10, 20, 50, 100, 500, 1000};
    public int getMoneyPool() { return moneyPool; }
    public void setMoneyPool(int moneyPool) { this.moneyPool = moneyPool; }
    public int getChange() { return change; }
    public void setChange(int change) { this.change = change; }
    public int getMachineContentLenght() { return machineContent.length; }
    public VendingMachine() {

    }
    public void stockMachine() {
        machineContent[0] = new Drinks("Coca Cola", 15, 145);
        machineContent[1] = new Drinks("Carbonated water", 18, 42);
        machineContent[2] = new Fruits("Orange", 10, 120);
        machineContent[3] = new Fruits("Banana", 30, 180);
        machineContent[4] = new Fruits("Apple", 24, 110);
        machineContent[5] = new Sweets("Chewing Gum",12, 80);
        machineContent[6] = new Sweets("Chocolate bar",25, 395);
        machineContent[7] = new Sweets("Mixed Candy",19, 339);

    }
    @Override
    public void addCurrency(int amount) {
        for (int x : acceptedDenominations) {
            if (amount == x) {
                setMoneyPool(moneyPool + amount);
                break;

            }

        }

    }
    @Override
    public int endSession() {
        setChange(getMoneyPool());
        setMoneyPool(0);
        return change;

    }
    @Override
    public Product productRequest(int productNumber) {
        if (moneyPool > machineContent[productNumber -1].getItemCost()) {
            setMoneyPool(getMoneyPool() - (machineContent[productNumber - 1].getItemCost()));
            return machineContent[productNumber - 1];

        }
        else {
            return null;

        }

    }
    @Override
    public String getDescription(int productnumber) {
        return machineContent[productnumber - 1].productInformation();

    }
    @Override
    public int getBalance() {
        return moneyPool;

    }
    @Override
    public List getProducts() { return Arrays.asList(machineContent); }

}
