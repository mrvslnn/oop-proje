package oopInheritanceConstractorCall;

public class Runner {
public static void main(String[] args) {
	Cat c1=new Cat("X");
	//ayn� isimli veriable larda hamgissinin kullan�ld�g�na karar vermek
	//icin olusturulan object in data type na bak�n�z
	//veriable i arast�rmaa data type i class�ndan
	System.out.println(c1.a);
	System.out.println(c1.c);
	System.out.println(c1.d);
	System.out.println(c1.m);
	
	
	Mammal c2=new Cat("X");
	System.out.println(c2.c);
	System.out.println(c2.m);
	
	Cat c3 =new Cat();
	/*method cag�r�l�rken ayn� �s�ml� method�ardan hangisini kullan�lacag�na
	 * contructor
	 */
}
}
