/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

/**
 *
 * @author User
 */
public class Book implements Display {

    protected String title;
    private Auther auther;
    private int no;
    private String genre;
    private int vertion;
    private String date;
    boolean onLoan;

    public Book() {
    }

    public Book(String title, Auther auther, int no, String genre, int vertion, String date) {
        this.title = title;
        this.auther = auther;
        this.no = no;
        this.genre = genre;
        this.vertion = vertion;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVertion() {
        return vertion;
    }

    public void setVertion(int vertion) {
        this.vertion = vertion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    @Override
    public boolean inLoan() {
        return onLoan;
    }

    @Override
    public String getInfo() {
        return "Book{"
                + "title='" + title + '\''
                + ", author=" + this .getAuther()
                + ", no=" + no
                + ", genre='" + genre + '\''
                + ", version=" + vertion
                + ", date='" + date + '\''
                + '}';
    }

}
