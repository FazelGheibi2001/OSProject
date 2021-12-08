package com.company.detail;

import com.company.domain.Customer;

import java.util.LinkedList;

public class ArrivalQueue {
    private LinkedList<Customer> customers;

    public ArrivalQueue() {
    }

    public void addCustomer(Customer customer) {
        this.customers.push(customer);
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(LinkedList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "ArrivalQueue{" +
                "customers=" + customers +
                '}';
    }
}
