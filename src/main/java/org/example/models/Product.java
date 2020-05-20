package org.example.models;

public abstract class Product {

    private static int productCounter = 0;
    private int productnumber;
    private String itemName;
    private int itemCost;
    private int itemCalorieCount;

    public int getProductnumber()
    { return productnumber; }

    public String getItemName()
    { return itemName; }

    public void setItemName(String itemName)
    { this.itemName = itemName; }

    public int getItemCost()
    { return itemCost; }

    public void setItemCost(int itemCost)
    { this.itemCost = itemCost; }

    public int getItemCalorieCount()
    { return itemCalorieCount; }

    public void setItemCalorieCount(int itemCalorieCount)
    { this.itemCalorieCount = itemCalorieCount; }



    public Product(String itemName, int itemCost, int itemCalorieCount) {
        productnumber = ++productCounter;
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.itemCalorieCount = itemCalorieCount;

    }
    public String productInformation () {
        String productInfo = "Product Information" + "\n" +
                "Productnumber: " + getProductnumber() + "\n" +
                "Product name: " + getItemName() + "\n" +
                "Cost (SEK): " + getItemCost() + "\n" +
                "Calories per 100g: " + getItemCalorieCount() + "\n";
        return productInfo;
    }
}
