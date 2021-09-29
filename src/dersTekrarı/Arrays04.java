package dersTekrarı;
import java.util.Arrays;
public class Arrays04 {

	public static void main(String[] args) {
		
		/*
		 * (2 boyutlu bir diziyi kabul eden ve 
		 * maksimum degeri bulan bir method yazin )
		 * Input : {{1,2,3},{4,5},{6,7,8}} 
		 * Output : 8 
		 */
		 int arr[][]= {{1,2,3},{4,5},{6,7,8}};
		 int max=arr[0][0];
    for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		if (arr[i][j]>max) {
			max=arr[i][j];
			
		}
		
	}
	
}
    System.out.println(max);
	}

}
