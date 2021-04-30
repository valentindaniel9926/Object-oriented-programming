package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double add(double real, double imaginary) {
        double sum = real + imaginary;
        return sum;
    }

    public double subtract(double real, double imaginary) {
        double subtract = real - imaginary;
        return subtract;
    }

  public double add(double number) {

  }

    public double subtract(double number){

    }
}
