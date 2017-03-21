package hackerrank.Algorithms.Sorting;

import java.util.*;

public class insertionSortPart2 {
	
	public static void insertionSort(int[] ar)
	{       
		
		int n=ar.length;
		
		for(int i=1;i<n;i++){
			
			int j=i-1;
			int temp=ar[i];
			
			while(j>=0 && ar[j]>temp){
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
			
			printArray(ar);
		}
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
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
