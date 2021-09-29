package replitForWhile;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*	
		Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.

	    */
		
		        	Scanner scan=new Scanner(System.in);
		        	
					System.out.println("lutfen biir isim giriniz");
					String isim=scan.nextLine();
					
					System.out.println("lutfen bir karakter giriniz");
					char karakter=scan.next().charAt(0);
					int sayac=0;
					
					for (int i = 0; i < isim.length(); i++) {
						if (karakter==isim.charAt(i)) {
							sayac++;
						}
					}
System.out.println(karakter+ " karakteri "+ sayac +" kez tekrarlanmistir");
	}

}
