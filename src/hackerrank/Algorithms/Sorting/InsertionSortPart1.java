package hackerrank.Algorithms.Sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		insertIntoSorted(arr);
		in.close();
	}

	public static void insertIntoSorted(int[] arr) {

		int i= arr.length - 1;
		int temp= arr[i];

		while(i>=1 && arr[i-1]>temp){
			arr[i]=arr[i-1];
			PrintArray(arr,arr.length);
			i--;
		}

		arr[i] = temp;
		PrintArray(arr, arr.length);

	}
	public static void PrintArray(int arr[],int n){

		for(int j=0;j<n;j++){
			System.out.print(arr[j] + " ");
		}
		System.out.print("\n");
	}

}
