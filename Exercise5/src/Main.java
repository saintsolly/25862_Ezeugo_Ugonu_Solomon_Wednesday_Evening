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
        // Create a Book object
        Book book1 = new Book("Java Programming", "B001", true, "John Doe");
        Book book2 = new Book("Data Structures", "B002", false, "Jane Smith");

        // Create a DVD object
        DVD dvd1 = new DVD("Inception", "D001", true, 148);
        DVD dvd2 = new DVD("The Matrix", "D002", false, 136);

        // Display the details of all items
        System.out.println("----- Library Items -----");
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        dvd1.displayDetails();
        System.out.println();
        dvd2.displayDetails();

        // Set availability of items
        book1.setAvailability(false);
        dvd1.setAvailability(false);

        System.out.println("\nUpdated Availability:");
        book1.displayDetails();
        dvd1.displayDetails();
    }
}
