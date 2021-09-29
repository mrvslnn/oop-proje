
package dersTekrarı;

import java.util.Scanner;
import java.util.Arrays;
public class Proje4 {

	public static void main(String[] args) {
		      /*
		        Problem Tan�m�:
			    addDigits isminde bir method olu�turun.
			    Parametresi int
			    Return tipi de int
			    Pozitif int de�erler ver ve en son sonu� tek basamakl� 
			    ��kana kadar basamaklar� birbiriyle topla.
			    Tek basamakl� ��kt���nda, d�nd�r�n
			    �rnek1:
			    Girdi 38
			    ��kt�: 2
			    A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1 = 2.
			                 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
			    */
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Say� giriniz: ");
		        int sayi = scanner.nextInt();
                System.out.println(addDigits(sayi));
		      
		      
	}
	public static int toplama(int sayi) {
		String str=String.valueOf(sayi);
		String  arr[]=str.split("");
		
		System.out.println(Arrays.toString(arr));
		int toplama=0;
		for (int i = 0; i < arr.length; i++) {
	       toplama += Integer.parseInt(arr[i]);
		}
		
		return toplama;
		
	}

	public static int addDigits(int sayi) {
		for (int i = 0; i < 2; i++) {
			
			sayi=toplama(sayi);
			
			/* ya da
			 * if (sayi>10) {
			for (int j = 0; j < 1; j++) {
				sayi=toplama(sayi);
				
			}
			
			if (sayi<10) {
				break;
				
			} 
			*/
			}
		
		return sayi;
		
		
	}

}
