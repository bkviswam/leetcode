package com.lc.august.google;

/**
 * 
 * 
 * Given an array nums of positive and negative integers and an int target. You
 * have +, -, *, / and () operators. Find out if it's possible to build an
 * expression that evaluates to the target value. Each operator can only be used
 * once. Return any solution or an empty string if it's not possible.
 * 
 * Example 1:
 * 
 * Input: nums = [1, 2, 3, 8, 4], target = 44 Output: "(3+8)*4" Example 2:
 * 
 * Input: nums = [2, 3, 4, 1, 9, 2], target = 21 Output: "3+2*9"
 *
 */

public class ArithmeticExpression {

	public static void main(String[] args) {
		ArithmeticExpression ae = new ArithmeticExpression();
		int target = 50;
		int numbers [] = new int[] {1, 2, 3, 8, 4};
		System.out.println(ae.getExpression(target));
	}
	public String getExpression(int target) {
		//TO DO
		return "";
		
	}
	

}
