package dersTekrarı;

import java.util.Iterator;

public class Arrays02 {

	public static void main(String[] args) {
		 /* (dizi elemanlarinin ortalama degerini hesaplayan ve
				 * ortalamadan b�y�k olan elemanlari yazd�ran bir 
				 * java programi yazin)
				 * input[]= {1,2,3,4,5,6,7} 
				 * Output : 4
				 */
		int arr[]= {1,2,3,4,5,6,7}; 
		int toplam=0;
for (int i = 0; i < arr.length; i++) {
	toplam+=arr[i];
}
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>toplam/arr.length) {
			System.out.println(arr[i]);
		}
	}
	
		
		
}
	}


