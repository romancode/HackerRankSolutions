package hackerrank.Algorithms.Search;

import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();

		for(int i=0;i<tc;i++){
			int M=sc.nextInt();

			int N=sc.nextInt();
			int indexOne=0, indexTwo=0;
			
			int[] flavors=new int[N];
			for(int j=0;j<N;j++){				
				flavors[j]=sc.nextInt();
			}

			for(int j=0;j<N-1;j++)
				for(int k=j+1;k<N;k++){
					if(flavors[j]+flavors[k]==M){
						indexOne=j+1;
						indexTwo=k+1;						
					}						
			}
			System.out.println(indexOne+" "+indexTwo);
			
		}
		sc.close();
	}

}
