package hackerrank.Algorithms.Strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		boolean isPangrams=true;
		char [] allAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner sc=new Scanner(System.in);

		String input=sc.nextLine();
		String S=input.toLowerCase();

		for (char letter : allAlphabet) {
			if (S.indexOf((int)letter) == -1) {
				isPangrams = false;   
			}
		}

		if (isPangrams) {
			System.out.println("pangram");    
		} else {
			System.out.println("not pangram");
		}
		
		sc.close();
	}

}
