/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Groceries.java
import java.util.Date;

class Groceries extends Product {
    private Date expiryDate;

    public Groceries(String productId, String name, double price, Date expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice() {
        // Groceries cannot have discounts
        return price;
    }

    public boolean isNearExpiry() {
        Date currentDate = new Date();
        long diffInMillies = expiryDate.getTime() - currentDate.getTime();
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);
        return diffInDays <= 7;  // Check if expiry is within 7 days
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Near Expiry: " + isNearExpiry());
    }
}

