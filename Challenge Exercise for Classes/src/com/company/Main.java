package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
	BankAccount bobsAccount = new BankAccount(12345,01212,"Bob","Bob@email.com","076564");

	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.00);

	bobsAccount.deposit(51.0);
	bobsAccount.withdrawal(100.0);
    BankAccount ValiAcoount = new BankAccount("123","121","131313");
		System.out.println(ValiAcoount.getPhonenumber());


    }
}
