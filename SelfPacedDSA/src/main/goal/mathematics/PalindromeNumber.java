package main.goal.mathematics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 142441;
		boolean isPalindrome = false;		
		isPalindrome = checkIfPalindrome(num);
		String str = isPalindrome ? "a" : "not a";
		System.out.println("Number is " + str + " palindrome");
	}

	public static boolean checkIfPalindrome(int num) {
		int reverseNum = 0;
		int tempNum = num;
		while(tempNum > 0) {
			reverseNum = reverseNum * 10 + tempNum % 10;
			tempNum = tempNum / 10;
		}		
		return num == reverseNum;
	}

}
