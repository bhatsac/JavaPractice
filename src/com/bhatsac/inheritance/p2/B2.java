package com.bhatsac.inheritance.p2;

import com.bhatsac.inheritance.p1.A1;

public class B2 {
	public static void main(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember); // private member not accessible 
		//System.out.println("A1.defaultMember: " + A1.defaultMember); // default member cant be accessed as they are not in same package
		
		//System.out.println("A1.protectedMember: " + A1.protectedMember); //B2 cant access A1 as B2 is not in same package as A1
		//System.out.println("C2.protectedMember: " + C2.protectedMember); //B2 cant access A1 throgh C2 as B2 is not in same package as A1
		
		System.out.println("A1.publicMember: " + A1.publicMember);
		System.out.println("C2.publicMember: " + C2.publicMember);
	}
}
