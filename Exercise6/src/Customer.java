/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Customer.java
public class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Method to place an order
    public void placeOrder(Product product) {
        System.out.println("\nCustomer: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        product.displayDetails();
        System.out.println("Shipping Cost: $" + product.calculateShippingCost());
        System.out.println("Estimated Delivery Time: " + product.getDeliveryTime() + " days");
    }
}
