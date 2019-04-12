package hackerrank.Contests.RookieRank3;

import java.util.Scanner;

public class FindTheBug {

	static int[] findTheBug(String[] grid){
		// Complete this function
		int row,col;
		int[] output=new int[2];;
		row=-1;col=-1;
		for(int grid_i=0; grid_i < grid.length; grid_i++){
			row=grid_i;
			if(grid[grid_i].contains("X")){
				col=grid[grid_i].indexOf('X');
				break;
			}
		}
		
		if(row > -1 && col >-1){
			output[0]=row;
			output[1]=col;
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for(int grid_i=0; grid_i < n; grid_i++){
			grid[grid_i] = in.next();
		}
		// Return an array containing [r, c]
		int[] result = findTheBug(grid);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
		}
		System.out.println("");

		in.close();

	}
}
