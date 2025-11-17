package dsa_practice;

import java.util.*;

public class RightRotateByK {
	
	public static void reverse(int[] arr, int l, int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	
	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		
		k = k % n;
		
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		rotate(arr, k);
		
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
