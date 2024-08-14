package com.chezuba;

public class ProblemOne {
	
	public int[] incrementOne(int[] digits) {
		
		int n = digits.length;
		
		//start from last digit
		for(int i = n-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		// If all digits  were 9, we need to increase the size of the array
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;
		return newDigits;
	}

	public static void main(String[] args) {
		 
		ProblemOne po = new ProblemOne();
		int[] digits = {1, 2, 9};
		int[] result = po.incrementOne(digits);
		
		System.out.print("Output: [");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if(i < result.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("]");
	}

}
