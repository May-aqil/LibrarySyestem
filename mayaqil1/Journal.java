/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mayaqil1;

/**
 *
 * @author User
 */
public class Journal extends Book {

    private String conferenceName;
    private int conferenceNo;

    public Journal() {
    }

    public Journal(String title, Auther author, int no, String genre, int version, String date, String conferenceName, int conferenceNo) {
        super(title, author, no, genre, version, date);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Conference Name: " + conferenceName + " - Conference No: " + conferenceNo;
    }

}
