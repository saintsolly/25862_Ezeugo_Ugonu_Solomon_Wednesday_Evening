/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Electronics.java
class Electronics extends Product {
    private int warrantyPeriod; // in months
    private String brand;

    public Electronics(String productId, String name, double price, int warrantyPeriod, String brand) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    @Override
    public double getDiscountedPrice() {
        // Apply 10% discount for electronics
        return price * 0.90;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Brand: " + brand);
    }
}
