package com.bhatsac.inheritance.methodbinding;
//package com.semanticsquare.oop;

public class UserTest {
	
	public void printUserType(User u) {
	    u.printUserType();
	}
	
	public void approveReview(Staff s) {
		if (s instanceof Editor) {
			((Editor) s).approveReview(); 
        } else {
        	System.out.println("Invalid object passed!!");
        }
	}

	
	public static void main(String[] args) {
		// Part 1
		/*User user = new User();
		User staff = new Staff();
		User editor = new Editor();*/
		
		//staff.postAReview("");
		
		//((Staff)staff).printId();
				
		/*UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);*/
		
		// Part 2
		//editor.approveReview();
		//editor.postAReview("");
		//editor.saveWebLink();	
		
		// Casting & instanceof demo
		//UserTest ut = new UserTest();
		//ut.approveReview(new Staff());
		//ut.approveReview(new Editor());		
		
		// Method binding demo
		User staff = new Staff();
		staff.staticMethod(); // part 1 // biding happens at compile time
		//staff.postAReview(""); // biding happens at run time
		//staff.instanceMethod(10); // part 2  // biding happens at run time and method in the User class is called and not in Staff class.
		//staff.instanceMethod(new Staff());
		
		// watch the video see the byte code undersanding
	}
}