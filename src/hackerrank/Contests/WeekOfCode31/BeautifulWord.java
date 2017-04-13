package hackerrank.Contests.WeekOfCode31;

import java.util.Scanner;

public class BeautifulWord {

	public static void main(String[] args) {
        boolean isBeutiful=true;
		String allVowel = "aeiouy";
		
		Scanner in = new Scanner(System.in);
        String w = in.next();
        String S=w.toLowerCase();
		
        boolean isPrevVowel=false; 
        char prevChar='\u0000';
        
        for(char letter: S.toCharArray()){
        	
        	if (allVowel.indexOf((int)letter) != -1) {
		
				if(isPrevVowel){
					isBeutiful=false;
				}
				isPrevVowel=true;
			}
        	else
        		isPrevVowel=false;
        	
        	
        	if(prevChar==letter){
				isBeutiful=false;
			}
			prevChar=letter;
			
        }
		
		
		
		if (isBeutiful) {
			System.out.println("Yes".trim());    
		} else {
			System.out.println("No".trim());
		}
		
		in.close();

	}

}
