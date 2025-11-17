package dsa_practice;

import java.util.*;

public class Remdup {
	public static int removeDup(int[] arr) {
		int j = 0;
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[j]!=arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}
		
		return j+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int l = removeDup(arr);
		
		for(int i = 0; i<l; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
