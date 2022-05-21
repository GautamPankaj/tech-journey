package main.goal.mathematics;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int x = 923;
		int count = countDigit(x);
		System.out.println("total digit " + count);
		
		int countRec = countDigitRec(x);
		System.out.println("total digit rec is  " + countRec);
	}

	public static int countDigitRec(int x) {
		if(x == 0)
			return 0;
		return 1 + countDigitRec(x/10);
	}

	public static int countDigit(int x) {
		int count = 0;
		while (x > 0) {
			x = x/10;
			count++;
		}
		return count;
	}

}
