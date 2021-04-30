package com.company;

public class BankAccount {
    private int number;
    private int balance;
    private String customername;
    private String email;
    private String phonenumber;

    public BankAccount(){
        this(11234,123,"Default name","Default Adress","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, int balance, String customername,String email, String phonenumber){
        System.out.println("BankAcoount constructor with the parameters called");
        this.number = number;
        this.balance = balance;
        this.customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public BankAccount(String customername, String email, String phonenumber) {
        this(1111,13123,customername,email,phonenumber);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
public void deposit(double DepositAmount){
    this.balance += DepositAmount;
    System.out.println("Deposit of " + DepositAmount + "made. New balance is " + this.balance);
}

public void withdrawal(double withdrawalAmount){
    if(this.balance - withdrawalAmount <0){
        System.out.println("Only" + this.balance + "available.Withdrawal not processed");
    } else{
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of" + withdrawalAmount + " processed.Remaining Balance");
}
}
}


