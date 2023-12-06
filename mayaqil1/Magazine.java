/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

/**
 *
 * @author User
 */
public class Magazine extends Book {

    private int issueNo;
    private String releaseDate;

    public Magazine(String title, Auther author, int no, String genre, int version, String date, int issueNo, String releaseDate) {
        super(title, author, no, genre, version, date);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Issue No: " + issueNo + " - Release Date: " + releaseDate;
    }

}
