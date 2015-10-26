package com.algorithm.service;

public class ReverseString {

	public static void main(String[] args) {
		String stringValue = "Thoufeeque is awesome and he is the best" ;
		Replace(stringValue.toCharArray(),stringValue.length());

	}
	
	public static void Replace(char [] str, int length) {
		int spaceCount = 0 , newLength,i= 0,j=0;
//		for ( i = 0; i <length ; i++) {
//			if(str[i] == ' ')  {
//				spaceCount++;
//			}
//		}
		newLength = 0;
		int reverse= 0;
		char replaceSpaceString [] = new char [length];
		char reverseString [] = new char [length];
		for ( i = length -1; i >= 0; i --) {
				replaceSpaceString[newLength] = str[i];
				newLength = newLength  + 1 ;
				if (str[i] == ' ') {
					for ( j = replaceSpaceString.length -1; j >= 0; j --) {
						reverseString[reverse] = replaceSpaceString[j];
						reverse++;
					}
					replaceSpaceString = reverseString;
				}
			
		}
		System.out.println(replaceSpaceString);
	}

}
