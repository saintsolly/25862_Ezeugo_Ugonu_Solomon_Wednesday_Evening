/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// DVD.java (Subclass of LibraryMaterial)
public class DVD extends LibraryMaterial {
    private int duration; // Duration in minutes

    public DVD(String title, String itemId, boolean isAvailable, int duration) {
        super(title, itemId, isAvailable);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Item ID: " + getItemId());
        System.out.println("Available: " + (checkAvailability() ? "Yes" : "No"));
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

