package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();
	calculator.setFirstNumber(20.0);
	calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(24.00);
        calculator.setSecondNumber(4);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());

    }
}
