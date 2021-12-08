package com.company.domain;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    private String nationalId;

    public Customer() {
    }

    public Customer(String firstName, String lastName, BankAccount account, String nationalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.nationalId = nationalId;
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
