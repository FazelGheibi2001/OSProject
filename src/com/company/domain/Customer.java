package com.company.domain;

import com.company.banker.BankerWork;

import java.util.Random;

public class Customer extends Thread {
    private String firstName;
    private String lastName;
    private BankAccount account;
    private String nationalId;
    private Random r;
    private boolean wantsBanker;
    private BankerWork bankerWork;

    public Customer() {
    }

    public Customer(BankerWork bankerWork, String firstName) {
        this.firstName = firstName;
        this.bankerWork = bankerWork;
        wantsBanker = true;
        r = new Random();
    }

    public Customer(String firstName, String lastName, BankAccount account, String nationalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.nationalId = nationalId;
        wantsBanker = true;
        r = new Random();
    }

    public void run() {
        wasteTime();
        bankerWork.customerReady(this);
    }

    public boolean wantsHaircut() {
        return wantsBanker;
    }

    public void wantsToLeave() {
        wantsBanker = false;
    }

    public void wasteTime() {
        try {
            this.sleep(Math.abs(r.nextInt(100000)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                ", nationalId='" + nationalId + '\'' +
                '}';
    }
}
