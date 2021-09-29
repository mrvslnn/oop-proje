package replitForWhile;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.

		* Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi bir say� M�kemmel Say� olarak bilinir.


		Input :

		6

		Output:

		6 Mukemmel Sayidir.

		======================

		Input 

		7

		Output:

		7 Mukemmel Sayidir degildir.
		*/
		Scanner scan = new Scanner(System.in);
	    
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
          int toplam = 0;
        
     /*   for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " M�kemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " M�kemmel bir sayi degildir.");
    
        }*/
          
          for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				toplam+=i;
			}
          }
			if (sayi==toplam) {
				System.out.println(sayi + " mukemmel bir sayidir");
			}else {
				System.out.println(sayi +" mukemmel sayi degildir");
			}
		}
          
          
          
          
          
          
          
	}
	


