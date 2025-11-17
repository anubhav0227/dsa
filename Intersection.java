package dsa_practice;

import java.util.*;

public class Intersection {
	
	public static ArrayList<Integer> intersection(int[] a, int[] b){
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					list.add(a[i]);
					break;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		for(int i = 0; i<n1; i++) {
			a[i] = sc.nextInt();
		}
		
		
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		for(int i = 0; i<n2; i++) {
			b[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list = intersection(a, b);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}

	}

}
