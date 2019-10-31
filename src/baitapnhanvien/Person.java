/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapnhanvien;

import java.util.Scanner;

public class Person {

    private String name;
    private String gender;
    private String dayOfBirth;
    private String address;

    public Person() {

    }

    public Person(String name, String gender, String dayOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.address = address;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return this.dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Gender: ");
        this.gender = sc.nextLine();
        System.out.print("Day of birth: ");
        this.dayOfBirth = sc.nextLine();
        System.out.print("Address: ");
        this.address = sc.nextLine();

    }

    public void showInfo() {
        System.out.print("Name: " + getName() + "; Gender: " + getGender()
                + "; Day of birth: " + getDayOfBirth() + "; Address: " + getAddress());

    }
}
