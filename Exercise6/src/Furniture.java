/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Furniture.java (Subclass of Product)
public class Furniture extends Product {
    private String material;

    public Furniture(String name, double price, double weight, String material) {
        super(name, price, weight);
        this.material = material;
    }

    @Override
    public double calculateShippingCost() {
        // Shipping cost for furniture is $10 per kg due to its larger size
        return getWeight() * 10;
    }

    @Override
    public int getDeliveryTime() {
        // Furniture usually takes 7-10 days for delivery
        return 7 + (int) (Math.random() * 4); // Random delivery time between 7-10 days
    }

    @Override
    public void displayDetails() {
        System.out.println("Product: " + getName());
        System.out.println("Material: " + material);
        System.out.println("Price: $" + getPrice());
        System.out.println("Weight: " + getWeight() + " kg");
    }
}
