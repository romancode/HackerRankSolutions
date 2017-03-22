package hackerrank.ThirtydaysOfCode;

import java.util.Scanner;

public class Day02Operators {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	        
	        double tipCost,taxCost,totalMealCost;
	        
	        tipCost=mealCost * tipPercent/100;
	        
	        
	        
	        taxCost= mealCost * taxPercent/100;
	        
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        totalMealCost=mealCost+tipCost+taxCost;
	        
	        int totalCost = (int) Math.round(totalMealCost);
	      
	        // Print your result
	        System.out.println("The total meal cost is "+ totalCost+" dollars.");
	}

}
