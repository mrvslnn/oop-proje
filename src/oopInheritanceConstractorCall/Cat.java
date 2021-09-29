package oopInheritanceConstractorCall;

public class Cat extends Mammal {
public int c=2;
public int d=5;

public Cat() {
	System.out.println("parametresiz cat");
}
public Cat(String s) {
	this();
	/*parent claas dan veriable veya method secmek
	 * icin super keyword unu kullamabiliriz
	 */
	System.out.println(super.c);
	System.out.println("parametreli cat");
}
public void mC() {
	System.out.println("cat");
}
}
