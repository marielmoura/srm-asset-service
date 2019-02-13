package com.srmasset.api.model;

import org.springframework.data.annotation.Id;

public class Customer {

    @Id
    private String id;

    private String name;
    private Double creditLimit;
    private Risk risk;
    private Double interestRate;

    public Customer(String name, Double creditLimit, Risk risk) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.risk = risk;
        this.interestRate = risk.getInterestRate();
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', creditLimit='%s', risk='%s' interestRate='%s']",
                id, name, creditLimit, risk, interestRate);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public Risk getRisk() {
        return risk;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() {
        interestRate = risk.getInterestRate();
    }
}