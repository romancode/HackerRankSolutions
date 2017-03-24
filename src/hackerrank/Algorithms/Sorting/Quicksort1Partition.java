package hackerrank.Algorithms.Sorting;

import java.util.Scanner;

public class Quicksort1Partition {

	static void partition(int[] ar) {

		int p=ar[0];
		int left[]=new int[ar.length];
		int right[]=new int[ar.length];
		int equal[]=new int[ar.length];
		int lcount=0,rcount=0, ecount=0;

		equal[ecount++]=p;

		for(int i=1;i<ar.length;i++){

			if(ar[i]>p){
				right[rcount++]=ar[i];
			}
			else if(ar[i]<p){
				left[lcount++]=ar[i];
			}
			else
				equal[ecount++]=ar[i];

		}

		/*printArray(left);
		printArray(equal);
		printArray(right);*/
		
		printArraywihN(left,lcount);
		printArraywihN(equal,ecount);
		printArraywihN(right,rcount);
		
	}   
	static void printArraywihN(int[] ar,int n){
		for(int i=0;i<n;i++){
			System.out.print(ar[i]+" ");
		}
	}
	static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		//System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt(); 
		}
		partition(ar);

		in.close();
	}    
}
