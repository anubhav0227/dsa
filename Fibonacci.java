package dsa_practice;

import java.util.*;

public class Fibonacci {
	
	public static int fib(int n) {
		if(n<=1) return n;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void printFib(int n) {
		for(int i = 0; i<n; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		printFib(n);

	}

}
