package dsa_practice;

import java.util.*;

public class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;

		for(int j = low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;

				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}

		int t = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = t;

		return i+1;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pi = partition (arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i =0 ; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0 ,n-1);

		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
