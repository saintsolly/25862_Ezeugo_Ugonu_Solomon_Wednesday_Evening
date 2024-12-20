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
        // Create Manager and Developer instances
        Manager manager = new Manager("John Doe", "M001", 80000, 10);  // 10 members in the team
        Developer developer = new Developer("Jane Smith", "D001", 60000, 5);  // 5 projects completed

        // Display Pay Slips
        System.out.println(manager.getPaySlip());
        System.out.println("\n" + developer.getPaySlip());
    }
}

