/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java (Test Class)
public class Main {
    public static void main(String[] args) {
        // Create products
        Electronics phone = new Electronics("Smartphone", 799.99, 0.5, "BrandX");
        Furniture sofa = new Furniture("Sofa", 499.99, 35, "Leather");

        // Create customer
        Customer customer = new Customer("Alice Johnson", "alice.johnson@email.com", "123 Main St, Cityville");

        // Place orders
        System.out.println("\nPlacing order for electronics:");
        customer.placeOrder(phone);

        System.out.println("\nPlacing order for furniture:");
        customer.placeOrder(sofa);
    }
}

