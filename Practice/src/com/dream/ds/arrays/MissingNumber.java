package com.dream.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lengthOfArray = scan.nextInt();
		int[] arrayOfNmubers = new int[lengthOfArray];
		for(int i=0; i < lengthOfArray; i++) {
			arrayOfNmubers[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arrayOfNmubers));		
		
		//following operation will take O(n log(n))
		Arrays.sort(arrayOfNmubers);
		System.out.println(Arrays.toString(arrayOfNmubers));
		
		//following operation will take O(log(n)) O(n) times so it will be O(n log(n))
		for(int i=1; i <= lengthOfArray; i++) {
			if(Arrays.binarySearch(arrayOfNmubers, i) < 0) {
				System.out.print(i);
				if(i!=lengthOfArray)
					System.out.print(" ");
			}
		}
	}

}
