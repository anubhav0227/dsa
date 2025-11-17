package dsa_practice;

import java.util.*;

public class ReverseArr {
	
	public static void reverse(int[] arr, int n) {
		int left = 0;
		int right = n-1;
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverse(arr, n);
		
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
