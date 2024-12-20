/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Intern.java
class Intern extends Employee {
    int duration; // in months

    public Intern(int id, String name, String department, int duration) {
        super(id, name, department);
        this.duration = duration;
    }

    @Override
    void work() {
        System.out.println(name + " is undergoing training.");
    }

    @Override
    void takeBreak() {
        System.out.println(name + " is taking a short break as an intern.");
    }

    @Override
    double calculateSalary() {
        double baseSalary = 20000;
        return baseSalary;
    }
}

