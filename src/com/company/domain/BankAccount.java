package com.company.domain;


import com.company.detail.AccountPeriod;

public class BankAccount {
    private String accountNumber;
    private Double balance;
    private AccountPeriod accountPeriod;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, Double balance, AccountPeriod accountPeriod) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountPeriod = accountPeriod;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountPeriod getAccountPeriod() {
        return accountPeriod;
    }

    public void setAccountPeriod(AccountPeriod accountPeriod) {
        this.accountPeriod = accountPeriod;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountPeriod=" + accountPeriod +
                '}';
    }
}
