package dsa_practice;

import java.util.*;

public class NonRepeating {
	
	public static char nonrepeat(String s) {
		int[] freq = new int[256];
		
		for(int i = 0; i<s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		
		for(int i = 0; i<s.length(); i++) {
			if(freq[s.charAt(i)] == 1) {
				return s.charAt(i);
			}
		}
		return '-';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(nonrepeat(s));

	}

}
