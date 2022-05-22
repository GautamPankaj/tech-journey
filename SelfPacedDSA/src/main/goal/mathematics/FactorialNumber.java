package main.goal.mathematics;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 0;
		int factorialRec =calFactorialRec(num); 
		System.out.println("factorial of " + num + " with recursion is " + factorialRec);
		
		int factorial =calFactorial(num); 
		System.out.println("factorial of " + num + " is " + factorial);
	}

	public static int calFactorial(int num) {
		int factorial = 1;
		while(num > 1) {
			factorial = factorial * num; 
			num--;
		}
		return factorial;
	}

	public static int calFactorialRec(int num) {
		if(num == 1 || num == 0 )
			return 1;
		return num * calFactorialRec(num - 1);
	}

}
