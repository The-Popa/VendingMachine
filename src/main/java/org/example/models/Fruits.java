package org.example.models;

public class Fruits extends Product {

    public Fruits(String itemName, int itemCost, int caloriecount) {
        super(itemName, itemCost, caloriecount);

    }

    @Override
    public String productInformation() {

        String productInfo = "Product Information" + "\n" +
                "Productnumber: " + getProductnumber() + "\n" +
                "Product name: " + getItemName() + "\n" +
                "Cost (SEK): " + getItemCost() + "\n" +
                "Calories per 100g: " + getItemCalorieCount() + "\n";
        return productInfo;

    }
    @Override
    public String toString () {
        return "\nProductnumber: " + getProductnumber() +
                "\nName: " + getItemName();
    }
}
