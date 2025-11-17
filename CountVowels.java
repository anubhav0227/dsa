package dsa_practice;

import java.util.*;

public class CountVowels {
	
	public static int vowels(String s) {
		int count = 0;
		s=s.toLowerCase();
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(vowels(s));

	}

}
