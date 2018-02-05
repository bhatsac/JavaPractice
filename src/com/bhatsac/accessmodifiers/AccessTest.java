package com.bhatsac.accessmodifiers;

public class AccessTest {

	public static void main(String[] args) {
		
		AccessCheck ac1= new AccessCheck();
		System.out.println(ac1.setS1("Keerthi").getS1());
		System.out.println(ac1.getS1());
		// cant access as its private.
		//ac1.s1;
	}
}
