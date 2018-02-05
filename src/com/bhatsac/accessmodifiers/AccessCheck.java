package com.bhatsac.accessmodifiers;

public class AccessCheck {

	
	private String s1;

	public String getS1() {
		return s1;
	}

	public AccessCheck setS1(String s1) {
		
		AccessCheck ac=new AccessCheck();
		//Private to the class level not at object level
		ac.s1="sachin Bhat";
		this.s1 = s1;
		return ac;
	}
	
	
}
