package com.company;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("12345",0.00,"Bob brown","myemail@gmail.com","07654343");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount .withdrawal(100.0);

        bobsAccount .deposit(50.0);
        bobsAccount .withdrawal(100.0);

        bobsAccount .deposit(51.0);
        bobsAccount .withdrawal(100.0);

        Account timbank = new Account("Tim","Tim@emaiil.com","12344");
        System.out.println(timbank.getNumber() + " name" + timbank.getCustomerName());



    }
}
