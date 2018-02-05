package com.bhatsac.inheritance.p2;

import com.bhatsac.inheritance.p1.A1;

public class C2 extends A1 {
	public static void main(String[] args) {
		//System.out.println("privateMember: " + privateMember); // private not accessible
		//System.out.println("defaultMember: " + defaultMember); //cannot access as its nont in same package
		System.out.println("protectedMember: " + protectedMember);//can be accessed as its inherited although not in same package
		System.out.println("publicMember: " + publicMember);
	}
}