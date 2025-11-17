package dsa_practice;

import java.util.*;

public class PalindromeString {
	
	public static boolean palin(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(palin(s) ? "Yes" : "No");

	}

}
