package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",245000.00);
        System.out.println(person2.getName());

        VipCustomer person3=  new VipCustomer("Tim",100.00,"Tim@gmail.com");
        System.out.println(person3.getName());
    }
}
