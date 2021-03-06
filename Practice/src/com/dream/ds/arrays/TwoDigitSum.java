package com.dream.ds.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoDigitSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lengthOfArray = scan.nextInt();
		int[] arrayOfNumbers = new int[lengthOfArray];
		int sumOfElements = 0;
		//1 2 3 2 4
		for(int i=0; i < lengthOfArray; i++) {
			arrayOfNumbers[i] = scan.nextInt();
			sumOfElements = sumOfElements + arrayOfNumbers[i];
		}
		// Sum of Elements should be twice of sum of two digits.
		if(sumOfElements % 2 != 0)
			System.out.println("No Two Numbers Available");
		else{
			int twoDigitsSum = sumOfElements / 2;
			//twoPointerTechnique(arrayOfNumbers, lengthOfArray, twoDigitsSum);
			hashingTechnique(arrayOfNumbers, lengthOfArray, twoDigitsSum);
		}
	}

	private static void hashingTechnique(int[] arrayOfNumbers, int lengthOfArray, int twoDigitsSum) {
		Set<Integer> set = new HashSet<Integer>();
		int requiredNumber;
		//following operation will take O(n)
		for(int i=0; i < lengthOfArray; i++) {
			requiredNumber = twoDigitsSum - arrayOfNumbers[i];
			 if(set.contains(requiredNumber)) {
					System.out.println("Two Numbers Available");
			 }
			 set.add(arrayOfNumbers[i]);
		}
	}

	private static void twoPointerTechnique(int[] arrayOfNumbers, int lengthOfArray, int twoDigitsSum) {
		//following operation will take O(n log(n))
		Arrays.sort(arrayOfNumbers);
		int pointerFromLeft = 0;
		int pointerFromRight = lengthOfArray-1;
		//following operation will take O(n)
		while(pointerFromLeft != lengthOfArray-1 || pointerFromRight != 0) {
			if(arrayOfNumbers[pointerFromLeft] + arrayOfNumbers[pointerFromRight] == twoDigitsSum) {
				System.out.println("Two Numbers Available");	
				break;
			}else if(arrayOfNumbers[pointerFromLeft] + arrayOfNumbers[pointerFromRight] > twoDigitsSum) {
				pointerFromRight--;
			}else {
				pointerFromLeft++;
			}
		}
		
			
	}

}
