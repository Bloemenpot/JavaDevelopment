package com.bluumpuut;

public class Main {

    public static void main(String[] args) {
	byte myByte = 10;
	short myShort = 20;
	int myInt = 50;
	long myLong;
	myLong = 50000 + ((myByte + myShort + myInt) * 10);
	System.out.println(myLong);

    }
}
