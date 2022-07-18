package java05.array;

import java.util.Arrays;

public class Array03_copy {
	public static void main(String[] args) {

		int[] arr = { 77, 50, 10, 12, 64, 15 };
		
		int[] tmp = new int[arr.length*2]; 
		//셀프 (반복문은을 이용해서 복사해보기)
		for(int i=0; i<arr.length*2; i++) {
			if(i<arr.length)
				tmp[i]=arr[i];
			else
				tmp[i] = arr[i-arr.length];
		}
		System.out.println(Arrays.toString(tmp));
		
		int[] tmp2 = new int[arr.length*2];
		//System.arraycopy(원본배열,원본 복사시작할 위치, 복사할 배열, 복사받을 시작위치, 복사할 크기)
		System.arraycopy(arr, 0, tmp2, 0, arr.length);
		System.arraycopy(arr, 0, tmp2, arr.length, arr.length);
		
		System.out.println(Arrays.toString(tmp2));
	}
}
