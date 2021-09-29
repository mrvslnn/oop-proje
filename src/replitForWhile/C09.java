package replitForWhile;

import java.util.Scanner;



public class C09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Kullan�c�n�n girdi�i say�y� tersine �eviren bir java program� yaz�n�z. (Mulakat Sorusu)


		Input  :1238

		Output :Girilen Numananin Tersi: 8321*/
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        
	      /*  System.out.print("Girdi�iniz numaranin tersi :  ");
	        while(sayi > 0) {
	            
	            System.out.print(sayi % 10);
	            sayi /= 10;
	        }
		*/
	        System.out.println("giridiginiz sayinin tersi : ");
	while (sayi>0) {//1238//123
		 System.out.print(sayi%10);//8//3
	       sayi/=10;//123//12
	}
		
	}

}
