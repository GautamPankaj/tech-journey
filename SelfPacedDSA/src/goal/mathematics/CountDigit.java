package goal.mathematics;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int x = 923;
		int count = countDigit(x);
		System.out.println("total digit " + count);
		
		int countRec = countDigitRec(x);
		System.out.println("total digit rec is  " + countRec);
	}

	private static int countDigitRec(int x) {
		if(x == 0)
			return 0;
		return 1 + countDigitRec(x/10);
	}

	private static int countDigit(int x) {
		// TODO Auto-generated method stub
		int count = 0;
		while (x > 0) {
			x = x/10;
			count++;
		}
		return count;
	}

}
