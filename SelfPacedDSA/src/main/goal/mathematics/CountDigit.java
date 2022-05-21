package main.goal.mathematics;

public class CountDigit {

	public static void main(String[] args) {
		int digit = 923;
		int count = countDigit(digit);
		System.out.println("total digit " + count);
		
		int countFromRec = countDigitRec(digit);
		System.out.println("total digit from recursion is  " + countFromRec);
	}

	public static int countDigitRec(int digit) {
		if(digit == 0)
			return 0;
		return 1 + countDigitRec(digit/10);
	}

	public static int countDigit(int digit) {
		int count = 0;
		while (digit > 0) {
			digit = digit/10;
			count++;
		}
		return count;
	}

}
