package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2  = new VipCustomer("Vali",240.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("John",100.00,"john23@yahoo.com");
        System.out.println(person3.getName());
    }
}
