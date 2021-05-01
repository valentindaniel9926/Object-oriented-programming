package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20,5);
	Case theCase= new Case("220b","Acer","240",dimensions);
	Monitor theMonitor = new Monitor("27inchBeast","Asus",27,new Resolution(2540,1440));

	MotherBoard theMotherBoard = new MotherBoard("Bj-200","Asus",4,6,"v2.44");

	PC thePC= new PC(theCase,theMonitor,theMotherBoard);
   thePC.powerUp();
}
}
