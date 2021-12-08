package com.company.detail;

import com.company.domain.Customer;

import java.util.Arrays;

public class WaitingChair {
    private Customer[] customers;

    public WaitingChair() {
        this.customers = new Customer[9];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "WaitingChair{" +
                "customers=" + Arrays.toString(customers) +
                '}';
    }
}
