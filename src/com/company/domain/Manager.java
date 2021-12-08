package com.company.domain;

import com.company.detail.Message;

public class Manager {
    private Message message;
    private Boolean check;

    public Manager() {
    }

    public Manager(Message message, Boolean check) {
        this.message = message;
        this.check = check;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "message=" + message +
                ", check=" + check +
                '}';
    }
}
