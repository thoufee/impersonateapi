package com.algorithm.excercise;

public class Substring {
	 public static void main(String[] args) {
		String first = "abc";
		String second = "a";
		if(first == second) {
			System.out.println("referances is same");
		} else {
			System.out.println("referances is not same");
		}
		
		if(first.equals(second)) {
			System.out.println("values is same");
		} else {
			System.out.println("values is not same");
		}
	}
}
