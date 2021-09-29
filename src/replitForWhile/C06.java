package replitForWhile;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir komut giriniz");
		  char komut=scan.next().charAt(0);
		  
		  switch(komut) {
		  case 'a' :
		  System.out.println("talebiniz isleniyor");
		  break;
		  case 'b':
		  System.out.println("yinede ilgilendiginiz tesekkur ederiz");
		  break;
		  case 'c' :
		   System.out.println("�zg�n�z, �u anda herhangi bir yard�m yok");
		  break;
		  default:
		  System.out.println("gecersiz giris tekrar deneyin");
		  }             
		  }
	}


