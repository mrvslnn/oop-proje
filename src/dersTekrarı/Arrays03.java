package dersTekrarı;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;

public class Arrays03 {

	public static void main(String[] args) {
	/*	(Dizideki en b�y�kk ikinci sayyiyi, maksimum ve minimum sayiyi
				bulmak i�in bir java programi yazin)
				
				int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
				
				*/
		/*int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
      
		System.out.println( arr[0]+ " "+ arr[arr.length-1]+" "
			      + arr[arr.length-2]);
			      */
		int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -91 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==arr[0] || arr[i]==arr[arr.length-2] || arr[i]==arr[arr.length-1]) {
			System.out.println(arr[i]);
		}
	}
		}
	}


