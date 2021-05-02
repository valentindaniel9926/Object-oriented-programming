package com.company;

public class VipCustomer {
    public String name;
    public double creditlimit;
    public String emailaddress;

    public VipCustomer() {
        this("Default name",4000.00,"Valentindaniel@yahoo.com");


    }

    public VipCustomer(String name , double creditlimit){
    this(name,creditlimit,"unknown@email.com");
    }

    public VipCustomer(String name, double creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
