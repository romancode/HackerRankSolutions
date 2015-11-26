package hackerrank.Algorithms.Strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		
		for(int i=0;i<tc;i++){
			String S=sc.next(); 
			String R=new StringBuilder(S).reverse().toString();
			boolean isFunny=true;
			
			for(int j=0;j<S.length()-1;j++){
				
				int  com01=S.charAt(j+1) - S.charAt(j);
				int  com02=R.charAt(j+1) - R.charAt(j);
				
				if(Math.abs(com01)!=Math.abs(com02)){
					isFunny=false;
					break;
				}				
			}				
			if(isFunny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
		
		sc.close();
	}

}
