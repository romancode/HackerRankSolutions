package hackerrank.Algorithms.Sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	
	public static void insertionSort(int[] ar)
	{       
		int n=ar.length;
		int noOfmove=0;
		
		for(int i=1;i<n;i++){
			
			int j=i-1;
			int temp=ar[i];
			
			while(j>=0 && ar[j]>temp){
				ar[j+1]=ar[j];
				j--;
				noOfmove++;
			}
			ar[j+1]=temp;
			
		}
		System.out.println(noOfmove);
	}  
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertionSort(ar);  
		
		in.close();
	}
}
