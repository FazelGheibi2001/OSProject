package com.company.detail;

import com.company.domain.Banker;
import com.company.domain.Customer;

public class Message {
    private String title;
    private String detail;
    private Customer customer;
    private RequestType type;
    private Banker banker;
    private Double amount;

    public Message() {
    }

    public Message(String title, String detail, Customer customer, RequestType type, Banker banker, Double amount) {
        this.title = title;
        this.detail = detail;
        this.customer = customer;
        this.type = type;
        this.banker = banker;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public Banker getBanker() {
        return banker;
    }

    public void setBanker(Banker banker) {
        this.banker = banker;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", customer=" + customer +
                ", type=" + type +
                ", banker=" + banker +
                ", amount=" + amount +
                '}';
    }
}
