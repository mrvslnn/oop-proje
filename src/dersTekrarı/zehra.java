package dersTekrarı;

import java.util.Scanner;

public class zehra {
	public static void main(String[] args) {
		// kullan�c�dan bir maas m�ktar� �stey�n
		// 80.000 in �zer�nde ise "kabul ediyorum"
		//60.000 ile 80.000 aras�nda �se "konusabilirz"
		//60.000 in alt�nda ise "malesef kabul edemem" yazd�r�n
		
		System.out.println("lutfen maas taleb�n�z� giriniz");
		Scanner scan=new Scanner(System.in);
		 int maas=scan.nextInt();
		 if (maas>=80000) {
			 System.out.println("kabul ed�yorum");
			 
			
		}else if (maas<80000 &&  maas>60000) {
			System.out.println("konusab�l�r�z");
			
		}else {
			System.out.println("malesef kabul edemem");
		}

	}


}
