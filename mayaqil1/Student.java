/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Student implements Display {

    private int id;
    protected String name;
    private String address;
    private String birthDate;
    private String major;
    private List<Book> borrowedBooks;
     private List<Loan> loans;

    public Student() {
    }

    public Student(int id, String name, String address, String birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.borrowedBooks = new ArrayList<>();
        this.loans = new ArrayList<>();
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean hasBorrowedBook(Book book) {
        return borrowedBooks.contains(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public boolean inLoan() {
        return !borrowedBooks.isEmpty();
    }
    
    public void addLoan(Loan loan) {
        loans.add(loan);
    }
     public List<Loan> getLoan() {
        return loans;
    }
    
    
    

    @Override
    public String getInfo() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate + ", major=" + major + '}';
    }

}
