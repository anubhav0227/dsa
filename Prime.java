package dsa_practice;

import java.util.*;

public class Prime {
	
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		
		for(int i = 2; i*i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(isPrime(n) ? "Yes" : "No");

	}

}
