package com.bhatsac.inheritance.castingInstanceof;

public class UserTest {
	
	public void printUserType(User u) {
	    u.printUserType();
	}
	
	public void approveReview(Staff s) {
		if (s instanceof Editor) {
			((Editor) s).approveReview(); // Explicit cast in is required when object is refrenced by super class.
			((Editor) s).postAReview();
        } else {
        	System.out.println("Invalid object passed!!");
        	// Instance of subclass is also an instance of superclass as below
        	System.out.println(s instanceof Staff);
        	System.out.println(s instanceof User);
        }
	}

	
	public static void main(String[] args) {
		// Part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		/*UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);*/
		
		// Part 2
		//editor.approveReview();
		//editor.postAReview();
		editor.saveWebLink();	
		
		// Casting & instanceof demo
		UserTest ut = new UserTest();
		ut.approveReview(new Staff());  // indtanceof operator will check if the its can be casted and avoid run time excep
		ut.approveReview(new Editor());	//Executes as expected
		//Object Type is what matters
		// Instance of subclass is also an instance of superclass
	}
}