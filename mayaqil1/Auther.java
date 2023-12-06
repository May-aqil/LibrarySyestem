/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

/**
 *
 * @author User
 */
public class Auther {

    private int id;
    private String name;
    private String address;
    private String Birthdate;

    public Auther() {
    }

    public Auther(int id, String name, String address, String Birthdate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.Birthdate = Birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getInfo() {
        return "Auther{" + "id=" + id + ", name=" + name + ", address=" + address + ", Birthdate=" + Birthdate + '}';
    }

}
