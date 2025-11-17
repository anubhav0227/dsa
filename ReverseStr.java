package dsa_practice;

import java.util.*;

public class ReverseStr {
	
	public static String revStr(String s) {
		char ch[] = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(revStr(s));

	}

}
