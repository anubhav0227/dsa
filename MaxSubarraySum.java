package dsa_practice;

import java.util.*;

public class MaxSubarraySum {
	
	public static int maxSubSum(int arr[]) {
		int current = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			current += arr[i];
			
			if(current > maxSum) {
				maxSum = current;
			}
			
			if(current < 0) {
				current = 0;
			}
		}
		
		return maxSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxSubSum(arr));

	}

}
