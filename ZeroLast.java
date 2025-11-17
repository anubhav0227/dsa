package dsa_practice;

import java.util.*;

public class ZeroLast {
	
	public static void zeroLast(int[] arr) {
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		zeroLast(arr);
		
		for(int i = 0; i<n; i++) {
			System.err.print(arr[i] + " ");
		}

	}

}
