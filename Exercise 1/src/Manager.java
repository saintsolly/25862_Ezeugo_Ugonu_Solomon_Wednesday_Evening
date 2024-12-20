/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Manager.java
class Manager extends Employee {
    int teamSize;
    double bonus;

    public Manager(int id, String name, String department, int teamSize, double bonus) {
        super(id, name, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }

    @Override
    double calculateSalary() {
        double baseSalary = 50000;
        return baseSalary + bonus;
    }
}

