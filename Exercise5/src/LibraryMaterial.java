/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// LibraryMaterial.java (Abstract Class)
public abstract class LibraryMaterial implements LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    public LibraryMaterial(String title, String itemId, boolean isAvailable) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = isAvailable;
    }

    // Encapsulated methods for accessing fields
    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    // Abstract method to display item details
    public abstract void displayDetails();
}

