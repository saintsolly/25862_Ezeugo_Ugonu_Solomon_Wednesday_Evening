/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Developer.java
class Developer extends Employee {
    String programmingLanguage;

    public Developer(int id, String name, String department, String programmingLanguage) {
        super(id, name, department);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    @Override
    double calculateSalary() {
        double baseSalary = 60000;
        return baseSalary;
    }
}
