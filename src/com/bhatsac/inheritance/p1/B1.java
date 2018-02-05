package com.bhatsac.inheritance.p1;

import com.bhatsac.inheritance.p2.C2;

public class B1 {
	public static void main(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);  // private member hence not accessible.
		
		System.out.println("A1.defaultMember: " + A1.defaultMember);
		System.out.println("C1.defaultMember: " + C1.defaultMember);
		
		System.out.println("A1.protectedMember: " + A1.protectedMember);
		System.out.println("C1.protectedMember: " + C1.protectedMember);
		System.out.println("C2.protectedMember: " + C2.protectedMember);  //can access it via C2(WOW!!) because B1 is in same package as A1
		
		System.out.println("A1.publicMember: " + A1.publicMember);		
		System.out.println("C1.publicMember: " + C1.publicMember);
	}
}