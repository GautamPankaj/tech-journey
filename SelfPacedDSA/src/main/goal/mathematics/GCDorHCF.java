package main.goal.mathematics;

public class GCDorHCF {

	public static void main(String[] args) {
		
		int i = 4;
		int j = 6;
		int gcd;
		
		gcd = calOptGCDEuclid(i, j);
		System.out.println("GCD of " + i + " and " + j + " is " + gcd);

	}
	
	public static int calOptGCDEuclid(int i, int j) {
		if(i % j == 0)
			return j;
		return calOptGCDEuclid(j, i%j);
	}

	public static int calGCDEuclid(int i, int j) {
		while(i != j) {
			if(i > j)
				i = i - j;
			else
				j = j -i;
		}
		return i;
	}
	
	public static int calGCDNaive(int i, int j) {
		int min = j;
		if(i < j)
			min = i;
		while(min > 1) {
			if(i % min == 0 && j % min == 0)
				return min;
			min--;
		}
		return min;
	}
	
	

}
