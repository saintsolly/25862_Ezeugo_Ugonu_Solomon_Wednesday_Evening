/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Book.java (Subclass of LibraryMaterial)
public class Book extends LibraryMaterial {
    private String author;

    public Book(String title, String itemId, boolean isAvailable, String author) {
        super(title, itemId, isAvailable);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Item ID: " + getItemId());
        System.out.println("Available: " + (checkAvailability() ? "Yes" : "No"));
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

