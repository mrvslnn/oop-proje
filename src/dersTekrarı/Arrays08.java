package dersTekrarı;
import java.util.Arrays;
public class Arrays08 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		// arr1 = { {1,2}, {3,4,5}, {6} }  ve  
		arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
				// Bu iki array'in tum elemanlarinin
				toplamini bulan programi yaziniz.
*/
		 int arr1[][] = { {1,2}, {3,4,5}, {6} };  
		 int arr2[][] = { {7,8,9}, {10,11}, {12} };
		int toplam=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				toplam=toplam+ arr1[i][j];
			}
		}
		System.out.println(toplam);
		int toplam1=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				toplam1=toplam1+ arr1[i][j];
			}
		}
		System.out.println(toplam+toplam1);
	}

}
