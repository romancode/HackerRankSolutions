package hackerrank.Algorithms.Search;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		
		int[] input;
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		
		for(int i=0;i<tc;i++){
			
			int noOfitem=sc.nextInt();
			
			input=new int[noOfitem];
			int totalsum=0,leftsum,rightsum;
			boolean flag=true;
			
			for(int j=0;j<noOfitem;j++){
				input[j]=sc.nextInt();
				totalsum+=input[j];
			}
			
			leftsum=0;
			rightsum=totalsum;
			
			for(int j=0;j<noOfitem;j++){
				leftsum=totalsum-rightsum;
				rightsum=rightsum-input[j];
				if(leftsum==rightsum)
				{
					flag=false;
					System.out.println("YES");
					break;
				}
			}
			
			if(flag)
				System.out.println("NO");
		}
		sc.close();
	}
}
