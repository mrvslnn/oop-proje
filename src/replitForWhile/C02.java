package replitForWhile;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Kullan�c�dan 2 tamsay� girmesini ve ard�ndan GCD (En B�y�k Ortak B�len) ve LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin.

		Input : 
			
		30

		40
			
			Beklenen Cikti:

		30 ve 40 icin GCD = 10

		30 ve 40 icin LCM = 120
		*/
		 Scanner scan=new Scanner(System.in);
		   System.out.println("lutfen iki tamsayi giriniz");
		   int sayi1=scan.nextInt();
		   int sayi2=scan.nextInt();
		   int ebob=0;
		for (int i = 1; i <= sayi1 && i<= sayi2; i++) {
			if (sayi1%i==0 && sayi2%i==0) {
				ebob=i;
			}
		}
       int ekok=(sayi1*sayi2)/ebob;
       System.out.println(sayi1 + " ve " + sayi2 +" icin GCD = "+ ebob);
       System.out.println( sayi1 +" ve "+ sayi2 +" LCM = "+ekok);
	}

}