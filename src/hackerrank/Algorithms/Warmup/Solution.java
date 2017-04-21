package hackerrank.Algorithms.Warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		PlusMinus();
	}

	public static void SimpleArraySum(){
		int data[];

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		data=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
			sum=sum+data[i];        			
		}
		System.out.println(sum);       
		sc.close();
	}


	public static void AVeryBigSum(){
		long data[],sum=0;

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		data=new long[n];

		for(int i=0;i<n;i++){
			data[i]=sc.nextLong();
			sum=sum+data[i];
		}
		System.out.println(sum);	
		sc.close();
	}

	public static void DiagonalDifference(){
		int data[][],firstdiagonal=0,seconddiagonal=0,n;

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		data=new int[n][n];

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				data[i][j]=sc.nextInt();							
			}


		for (int k = 0; k < n; ++k)
		{
			firstdiagonal = firstdiagonal + data[k][k];
			seconddiagonal = seconddiagonal + data[k][n - k - 1];
		}

		System.out.println(Math.abs(firstdiagonal-seconddiagonal));
		sc.close();
	}

	public static void PlusMinus(){
		int n, nCount=0, pCount=0,zCount=0,input;

		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		for(int i=0;i<n;i++){
			input=sc.nextInt();

			if(input==0)
				zCount++;
			else if (input>0)
				pCount++;
			else
				nCount++;
		}
		System.out.printf("%.3f %n", ((double)pCount / n));
		System.out.printf("%.3f %n", ((double) nCount / n));
		System.out.printf("%.3f", ((double) zCount / n));

		sc.close();
	}

	public static void TimeConversion(){

		Scanner sc = new Scanner(System.in);
		String d = sc.next();

		try {
			DateFormat df = new SimpleDateFormat("hh:mm:ssa");
			DateFormat out = new SimpleDateFormat("HH:mm:ss");
			Date date = df.parse(d);
			System.out.println(out.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		sc.close();
	}


}

