package com.company;

public class Account {
        public String number;
        private double balance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;

        public Account(){
            this("21313",2.50,"Default name","Degault address","default phone");
            System.out.println("Empty constructor called");
        }
        public Account(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
            System.out.println("bank constructor with parameters called");
            this.number=number;
            this.balance=balance;
            this.customerEmailAddress=customerEmailAddress;
            this.customerName=customerName;
            this.customerPhoneNumber=customerPhoneNumber;
        }

        public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
            this("8888",100.55,customerName,customerEmailAddress,customerPhoneNumber);
        }

        public void deposit(double depositAmount){
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance );
        }
        public void withdrawal(double withdrawalAmount){
            if(this.balance-withdrawalAmount<0){
                System.out.println("Only " + this.balance + "  available. Withdrawal not processed");
            }else{
                this.balance-= withdrawalAmount;
                System.out.println("withdrawal of " + withdrawalAmount + " processed. Remaining balance " + this.balance);
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmailAddress() {
            return customerEmailAddress;
        }

        public void setCustomerEmailAddress(String customerEmailAddress) {
            this.customerEmailAddress = customerEmailAddress;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


