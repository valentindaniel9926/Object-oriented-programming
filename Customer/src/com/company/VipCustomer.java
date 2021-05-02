package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String EmailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        EmailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
       this(name,creditLimit,"unknowm@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public VipCustomer(){
        this("Default name",50000.0,"defaultemail@email.com");
    }

}
