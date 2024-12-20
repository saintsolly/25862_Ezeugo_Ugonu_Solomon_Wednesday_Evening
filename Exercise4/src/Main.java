/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Employees
        Employee emp1 = new Employee("John Doe", "john@example.com", 30, "E001", 50000, "IT");
        Employee emp2 = new Employee("Jane Smith", "jane@example.com", 28, "E002", 55000, "Marketing");

        // Creating Managers
        Manager manager1 = new Manager("Sarah Lee", "sarah@example.com", 40, "M001", 70000, "HR");
        Manager manager2 = new Manager("Michael Brown", "michael@example.com", 45, "M002", 75000, "Finance");

        // Adding Employees to Managers
        manager1.addSubordinate(emp1);
        manager2.addSubordinate(emp2);

        // Creating CEO
        CEO ceo = new CEO("Alice Johnson", "alice@example.com", 50, "C001", 150000, "Executive", "Oversee the company operations");

        // Adding Managers to CEO
        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);

        // Creating Clients
        Client client1 = new Client("David Wilson", "david@example.com", 35, "TechCorp", "1234 Elm Street");
        Client client2 = new Client("Eva Thomas", "eva@example.com", 40, "RetailCo", "5678 Oak Avenue");

        // Displaying details
        System.out.println("----- Employee Details -----");
        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
        System.out.println();
        manager1.displayInfo();
        System.out.println();
        manager2.displayInfo();
        System.out.println();
        ceo.displayInfo();
        System.out.println();

        // Display Clients' details
        System.out.println("----- Client Details -----");
        client1.displayInfo();
        System.out.println();
        client2.displayInfo();
        System.out.println();

        // CEO compiles employee list
        ceo.compileEmployeeList();
    }
}

