package replitArrays;

import java.util.Arrays;

public class Array08 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 * 
		 * Input1={1,2,3,4}
		 * 
		 * Input2={5,6}
		 * 
		 * Output={1,2,3,4,5,6}
		 */

		int arr[] = { 1, 2, 3, 4 };
		int[] arr1 = { 5, 6 };
		int[] sonuc = new int[arr.length + arr1.length];

		for (int i = 0; i < sonuc.length; i++) {
			if (i < arr.length)
				sonuc[i] = arr[i];
			else
				sonuc[i] = arr1[i - arr.length];
		}

		System.out.println("Birleştirilmiş dizi:" + Arrays.toString(sonuc));
	}

}
