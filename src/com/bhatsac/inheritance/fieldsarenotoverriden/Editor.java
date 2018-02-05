package com.bhatsac.inheritance.fieldsarenotoverriden;

public class Editor extends Staff {
	public void printUserType() {
	  System.out.println("Editor");
	}
	
	public void approveReview() {
		System.out.println("Editor: approveReview");
	}
}
