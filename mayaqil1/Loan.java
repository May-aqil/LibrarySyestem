/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Loan {

    private Student student;
    private Book book;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Loan(Student student, Book book,LocalDate dueDate) {
        this.student = student;
        this.book = book;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(5); // Set due date as 5 days from the issue date
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(dueDate);
    }

    @Override
    public String toString() {
        return "Loan{"
                + "student=" + student
                + ", book=" + book
                + ", issueDate=" + issueDate
                + ", dueDate=" + dueDate
                + '}';
    }

}
