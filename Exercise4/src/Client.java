/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Client.java
class Client extends Person {
    private String companyName;
    private String address;

    public Client(String name, String email, int age, String companyName, String address) {
        super(name, email, age);
        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
    }
}

