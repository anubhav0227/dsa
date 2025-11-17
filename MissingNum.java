package dsa_practice;

import java.util.*;

public class MissingNum {
	
	public static int findMiss(int arr[], int n) {
		int expectedSum = n * (n+1) /2;
		int aSum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			aSum += arr[i];
		}
		
		return expectedSum - aSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n-1];
		
		for(int i = 0; i<n-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findMiss(arr, n));

	}

}
