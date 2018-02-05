package com.bhatsac.inheritance.overriding;

public class Staff extends User {
	public int id = 2;	 // Hides the parent variable.
	public void printId() {
		System.out.println("id: " + id); 
		System.out.println("super.id: " + super.id); //access the hidden field super can be used.
	}
	
	public void printUserType() {
		System.out.println("Staff");
	}
	
	// cannot make access modifier private, protected or default, narrowing the scope is not allowed for sub class. Other way round is allowed(inverted funnel)
	// Return type should be compatible type,method name should be same,parameters should be same or derived/compatible type
	// ex:--public Object postAReview(StringBuffer reviewText) {
	public Review postAReview(String reviewText) {
	   System.out.println("Staff: postAReview");
	   Review review = super.postAReview(reviewText);
	   review.setApproved(true);
	   return review;
	}
}