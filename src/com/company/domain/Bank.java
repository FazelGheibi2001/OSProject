package com.company.domain;

import com.company.detail.ArrivalQueue;
import com.company.detail.WaitingChair;

import java.util.Arrays;

public class Bank {
    private String name;
    private ArrivalQueue arrivalQueue;
    private WaitingChair waitingChair;
    private Banker[] bankers;

    public Bank() {
        this.bankers = new Banker[2];
    }

    public Bank(String name, ArrivalQueue arrivalQueue, WaitingChair waitingChair) {
        this.name = name;
        this.arrivalQueue = arrivalQueue;
        this.waitingChair = waitingChair;
        this.bankers = new Banker[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrivalQueue getArrivalQueue() {
        return arrivalQueue;
    }

    public void setArrivalQueue(ArrivalQueue arrivalQueue) {
        this.arrivalQueue = arrivalQueue;
    }

    public WaitingChair getWaitingChair() {
        return waitingChair;
    }

    public void setWaitingChair(WaitingChair waitingChair) {
        this.waitingChair = waitingChair;
    }

    public Banker[] getBankers() {
        return bankers;
    }

    public void setBankers(Banker[] bankers) {
        this.bankers = bankers;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", arrivalQueue=" + arrivalQueue +
                ", waitingChair=" + waitingChair +
                ", bankers=" + Arrays.toString(bankers) +
                '}';
    }
}
