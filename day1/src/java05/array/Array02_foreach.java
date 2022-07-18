package java05.array;

import java.util.Arrays;

public class Array02_foreach {
	public static void main(String[] args) {

		int[] arr = { 77, 50, 10, 12, 64, 15 };

//		for(int x : arr) {
//			x *= 2;
//		}

//		for(int x : arr) {
//			System.out.println(x);
//		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}

		for (int x : arr) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
