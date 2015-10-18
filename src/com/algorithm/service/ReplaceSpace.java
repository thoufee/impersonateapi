package com.algorithm.service;

public class ReplaceSpace {

	public static void main(String[] args) {
		String stringValue = "Thoufeeque is awesome and he is the best" ;
		Replace(stringValue.toCharArray(),stringValue.length());

	}
	
	public static void Replace(char [] str, int length) {
		int spaceCount = 0 , newLength,i= 0;
		for ( i = 0; i <length ; i++) {
			if(str[i] == ' ')  {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		char replaceSpaceString [] = new char [newLength];
		
		for ( i = length -1; i >= 0; i --) {
			if (str[i] == ' ') {
				replaceSpaceString[newLength - 1] = '0';
				replaceSpaceString[newLength - 2] = '2';
				replaceSpaceString[newLength - 3] = '%';
				newLength = newLength - 3 ;
			} else {
				replaceSpaceString[newLength - 1] = str[i];
				newLength = newLength - 1 ;
			}
		}
		System.out.println(replaceSpaceString);
	}

}
