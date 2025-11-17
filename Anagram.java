package dsa_practice;

import java.util.*;

public class Anagram {

	public static boolean anag(String s1, String s2) {
		s1 = s1.toLowerCase(); 
		s2 = s2.toLowerCase(); 

		if (s1.length() != s2.length()) return false;

		int freq[] = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (c1 < 'a' || c1 > 'z') return false;
			if (c2 < 'a' || c2 > 'z') return false;

			freq[c1 - 'a']++;
			freq[c2 - 'a']--;
		}

		for (int i = 0; i < 26; i++)
			if (freq[i] != 0) return false;

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		System.out.println(anag(s1, s2) ? "Yes" : "No");

	}

}
