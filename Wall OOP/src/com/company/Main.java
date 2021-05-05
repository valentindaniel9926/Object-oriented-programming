package com.company;

public class Main {

    public static void main(String[] args) {
	Wall walL= new Wall(5.0,4.0);
        System.out.println("Area= " + walL.getArea());
        walL.setHeight(-1.5);
        System.out.println("Width= " + walL.getWidth());
        System.out.println("Height= " + walL.getHeight());
        System.out.println("area= " + walL.getArea());
    }
}
