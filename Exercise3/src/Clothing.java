/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Clothing.java
class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productId, String name, double price, String size, String material) {
        super(productId, name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public double getDiscountedPrice() {
        // Apply seasonal discount: 20% off during sale
        return price * 0.80;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

