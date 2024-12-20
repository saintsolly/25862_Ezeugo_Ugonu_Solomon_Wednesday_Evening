/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Electronics.java (Subclass of Product)
public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, double weight, String brand) {
        super(name, price, weight);
        this.brand = brand;
    }

    @Override
    public double calculateShippingCost() {
        // Shipping cost for electronics is $5 per kg
        return getWeight() * 5;
    }

    @Override
    public int getDeliveryTime() {
        // Electronics usually take 3-5 days for delivery
        return 3 + (int) (Math.random() * 3); // Random delivery time between 3-5 days
    }

    @Override
    public void displayDetails() {
        System.out.println("Product: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + getPrice());
        System.out.println("Weight: " + getWeight() + " kg");
    }
}
