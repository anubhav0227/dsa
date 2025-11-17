package dsa_practice;

import java.util.*;

public class LongestCommonPrefix {
	
	public static String lcp(String arr[]) {
		String prefix = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			while(arr[i].indexOf(prefix) !=0 ) {
				prefix = prefix.substring(0, prefix.length()-1);
				if (prefix.length() == 0)
					return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(lcp(arr));

	}

}
