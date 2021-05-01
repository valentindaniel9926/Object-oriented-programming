package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	Case theCase = new Case("220b","ASUS","240",dimensions);
	Monitor theMonitor = new Monitor("30inchbeast","Msi",30,new Resolution(2540,1440));
	MotherBoard theMotherBoard = new MotherBoard("BJ-200","ASUS",5,6,"v2.55");

	PC thePC = new PC(theCase,theMonitor,theMotherBoard);
thePC.PowerUp();
    }
}
