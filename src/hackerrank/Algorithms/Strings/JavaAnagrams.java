package hackerrank.Algorithms.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < b.length(); i++) {
			char letter = b.charAt(i);
			if (!map.containsKey(letter))
				map.put(letter, 1);
			else {
				int feq = map.get(letter);
				map.put(letter, ++feq);
			}
		}

		for (int i = 0; i < a.length(); i++) {
			char letter = a.charAt(i);
			if (!map.containsKey(letter))
				return false;

			int feq = map.get(letter);
			if (feq == 0)
				return false;
			else {
				map.put(letter, --feq);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
