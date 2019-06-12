package code_test1;

import java.util.*;

public class Array_sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temp;
		System.out.println("enter array size");
		int a = s.nextInt();

		int k[] = new int[a];
		for (int i = 0; i < a; i++) {
			k[i] = s.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 1 + i; j < a; j++) {
				if (k[i] > k[j]) {
					temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		System.out.println("sortee order");
		for (int i = 0; i < a; i++) {
			System.out.println(k[i]);
		}
	}

}
