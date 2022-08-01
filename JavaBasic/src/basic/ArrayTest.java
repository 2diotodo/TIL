package basic;

public class ArrayTest {
	public static void main(String[] args) {
		int N = 4;	//row : y, r
		int M = 3;	//col : x, c
		
		int[][] arr1 = new int[N][N];
		int[][] arr2 = new int[N][M];
		int[][] arr3 = new int[N][];
		
		arr3[0] = new int[3];
		arr3[1] = new int[6];
		arr3[3] = new int[1];
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
			
		}
		
		
	}
}
