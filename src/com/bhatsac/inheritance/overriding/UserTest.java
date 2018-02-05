package com.bhatsac.inheritance.overriding;

public class UserTest {

	public static void main(String[] args) {
		
		
		User u= new Staff();
		u.postAReview("sachin");
		((Staff) u).printId();//access the hidden field super can be used.

	}

}
