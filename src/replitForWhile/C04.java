package replitForWhile;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
	/*	Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi yaz�niz.

		Input : 6

		Output: 6!=6*5*4*3*2*1=720
		*/
	
	  Scanner scan=new Scanner(System.in);
    System.out.println("Bir sayi giriniz.");
    int sayi=scan.nextInt();
    int carpim=1;
    
    System.out.print(sayi+"!=");
    
    for (int i =sayi; 1<=i; i--) {
       // System.out.print(i+"*");
        carpim*=i;
       System.out.print(i);
        if (i!=1) {
          System.out.print("*");
        }
    }
    
    System.out.print("="+carpim);
    scan.close();

}
}
