package dersTekrarı;

import java.util.Scanner;

public class zehra01 {
public static void main(String[] args) {
	// kullan�c�dan bir say� al�n ve 3 basamakl� �se �uc basamakl�� yoksa 
			//3 basamakl� deg�l� yazd�r�n
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen br sayi giriniz");
	int sayi=scan.nextInt();
	String sayi1 = String.valueOf(sayi);
	if (sayi1.length()==3) {
		System.out.println("uc basmakli");
	}else {
		System.out.println("uc basamakli degil");
	}
	int sayi2=Integer.parseInt(sayi1);
	
}
}
