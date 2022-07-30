import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		if ('A' < 'Z')
			System.out.print("0");
		else
			System.out.print("2");
		System.out.print("3");

		System.out.println("=======================");
		int i = 0;
		int j = 0;
		while (i < 5) {
			i++;
			if (i % 2 != 0) {
				System.out.print(++j);
			}
			i++;
		}

		Integer[] arr = new Integer[] { 1, 3, 5, 2, 4, 1 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		// 오름차순
//		set.iter(new AscDescending()); // sort 사용하려면 Comparator 상속필요
//		System.out.println(aList);
		// 내림차순
//			aList.sort(new Descending());
//		System.out.println(aList);

		ArrayList<String> v = new ArrayList<String>();
		v.add("java");
		v.add("Jsp");
		v.add("spring");

		System.out.println(v.toString());
		ArrayList<String> t = new ArrayList<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString());

		v.removeAll(t); // v.toString - t.toString()
		System.out.println("v.toString - t.toString(): " + v.toString());

		System.out.println("===========================");
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int len = 8;
		int sum = 0;
		
		int[] arr2 = new int[len];
		for (int k = 0; k < arr1.length; k++) {

			arr2[k] = arr1[k];
		}
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = new int[arr2.length];
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		System.out.println(Arrays.toString(arr3));


		int[] arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(Arrays.toString(arr4));


		int[] arr5 = (int[]) arr4.clone();
		System.out.println(Arrays.toString(arr5));

		for(int k = 0; k<len; k++) {
			sum = sum + arr2[i]+arr3[i]+arr4[i]+arr5[i];
			
		}
		System.out.println(sum);
		System.out.print(arr2.length + arr3.length + arr4.length + arr5.length);
	}// end main()

}
