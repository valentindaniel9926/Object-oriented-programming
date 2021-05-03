package com.company;

public class Main {

    public static void main(String[] args) {
	Bugatti bugatti = new Bugatti(36);
	bugatti.steer(45);
	bugatti.accelerate(30);
	bugatti.accelerate(20);
	bugatti.accelerate(-42);
    }
}
