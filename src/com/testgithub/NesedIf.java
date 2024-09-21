package com.testgithub;

public class NesedIf {

	public static void main(String[] args) {
		String a="Manoj";
		if(a=="manoj") {
			System.out.println("Invalid string");
			if(a=="Manoj") {
				System.out.println("String valid");
			}
		}
		else if(a=="Sheela") {
			System.out.println("Invalid string");
		}
		else if(a=="Prema") {
			System.out.println("Invalid string");
		}
		else if(a=="Manoj") {
			System.out.println("Valid string");
		}
		else {
			System.out.println("Condition failed");
		}
	}
}
