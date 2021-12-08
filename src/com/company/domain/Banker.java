package com.company.domain;

import com.company.detail.Message;

public class Banker {
    private String name;
    private Integer id;
    private Customer customer;
    private Message message;
    private Manager manager;

    public Banker() {
    }

    public Banker(String name, Integer id, Customer customer, Message message, Manager manager) {
        this.name = name;
        this.id = id;
        this.customer = customer;
        this.message = message;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Banker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", customer=" + customer +
                ", message=" + message +
                ", manager=" + manager +
                '}';
    }
}
