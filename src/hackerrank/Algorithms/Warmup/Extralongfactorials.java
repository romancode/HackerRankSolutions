package hackerrank.Algorithms.Warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class Extralongfactorials {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		BigInteger result=BigInteger.valueOf(1);

		for(int i=1; i<=n; i++)
			result=result.multiply(BigInteger.valueOf(i));

		System.out.println(result);			
		
		sc.close();
	}
}
