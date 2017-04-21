package hackerrank.Java.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		List<List<Integer>> outer = new ArrayList<List<Integer>>();


		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			int d=sc.nextInt();
			List<Integer> inner = new ArrayList<Integer>();
			for(int j=0; j<d;j++){
				int val=sc.nextInt();
				inner.add(val);
			}
			outer.add(inner);

		}

		int q=sc.nextInt();

		for(int i=0;i<q;i++){
			
			int y=sc.nextInt()-1;
			int x= sc.nextInt()-1;
/*
			if(outer.size() < y || outer.get(y).size() < x ){
				System.out.println("ERROR!");
			}
			else{
				System.out.println(outer.get(y).get(x));
			}
			*/
			try {
	            System.out.println(outer.get(y).get(x));
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("ERROR!");
	        }
		}

		sc.close();
	}

}
