package hackerrank.Contests.WeekOfCode31;

import java.util.Scanner;

public class AccurateSorting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // Write Your Code Here
            
            boolean isSortable=false;
            
            for(int i=0;i<a.length-1;i++){
            	if(Math.abs((a[i]-a[i+1]))==1){
            		isSortable=true;
            	}
            	else
            		isSortable=false;
            }
            	
        
            if(isSortable){
            	System.out.println("Yes");
            }
            else
            	System.out.println("No");
        }

	}

}
