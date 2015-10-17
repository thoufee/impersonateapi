package com.algorithm.excercise;

import java.util.ArrayList;

public class Permutation {
	public static int [] set = {7,5,4};
	public static ArrayList<Integer> coll = new ArrayList<Integer>();
		
	public static void function(int target){
		if(target == 0){
			for(int i : coll){
				System.out.print(i);
			}
			System.out.println("");
			coll.remove(coll.size()-1);
		}
		else{
			for(int i=0; i<set.length; i++){
				if(set[i] <= target){
					coll.add(set[i]);
					target = target-set[i];
					function(target);
					target = target+set[i];
				}
			}
			if(!coll.isEmpty()){
				coll.remove(coll.size()-1);
			}
		}
	}
	public static void main(String [] args){
		function(12);
	}

}
