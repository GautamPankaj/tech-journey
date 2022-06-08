package main.goal.mathematics;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		int num = 251;
			
		int trailingZeros = calTrailZeroFact(num); 
		System.out.println("trailing zero is " + trailingZeros);
		
	}

	public static int calTrailZeroFact(int num) {
		int result = 0;
		for(int i=5; i < num; i = i*5) {
			result = result + num / i;
		}
		return result;
	}

}
