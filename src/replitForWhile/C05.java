package replitForWhile;

public class C05 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.

		OUTPUT  : 
		100 98 96 94 92 � � � � 2 0
		*/
		int sayi=100;
		while (sayi>=0) {
			if (sayi%2==0) {
				System.out.print(sayi +" ");
			}
			sayi--;
		}
	}

}
