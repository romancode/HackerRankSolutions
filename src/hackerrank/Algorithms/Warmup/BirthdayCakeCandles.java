package hackerrank.Algorithms.Warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max=0,count=0;
		int height[] = new int[n];
		for(int height_i=0; height_i < n; height_i++){
			height[height_i] = in.nextInt();
			if(height[height_i]>max){
				max=height[height_i];
				count=0;
			}
			if(height[height_i]==max)
				count++;
		}
		System.out.println(count);
		
		in.close();
	}

}
