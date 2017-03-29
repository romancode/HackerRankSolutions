package hackerrank.ThirtydaysOfCode;

import java.util.Scanner;

public class Day9Recursion {

	static int factorial(int n){
		
		int fact=1;

		if (n==0)
			return fact;
		else
			fact=n*factorial(n-1);

		return fact;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
		
		in.close();
	}

}
