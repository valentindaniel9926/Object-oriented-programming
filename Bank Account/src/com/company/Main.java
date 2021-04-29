package com.company;

public class Main {

    public static void main(String[] args) {
        bank bobsbank = new bank("12345",0.00,"Bob brown","myemail@gmail.com","07654343");
        System.out.println(bobsbank.getNumber());
        System.out.println(bobsbank.getBalance());

        bobsbank.withdrawal(100.0);

        bobsbank.deposit(50.0);
        bobsbank.withdrawal(100.0);

        bobsbank.deposit(51.0);
        bobsbank.withdrawal(100.0);

        bank timbank = new bank("Tim","Tim@emaiil.com","12344");
        System.out.println(timbank.getNumber() + " name" + timbank.getCustomerName());



    }
}
