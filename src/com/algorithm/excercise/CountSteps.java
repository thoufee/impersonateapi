package com.algorithm.excercise;

public class CountSteps {

	public static void main(String[] args) {
		int steps = 3;
		int possibleways = countSteps(steps);
		System.out.println(possibleways);

	}
	
	private static int countSteps(int n) {
		if(n < 0) {
			return 0;
		} else if (n == 0 ) {
			return 1;
		} else {
			return countSteps(n-1) + countSteps(n-2) +countSteps(n-3);
		}
	}
}
