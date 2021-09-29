package oopInheritanceConstractorCall;

public class Mammal extends Animal{
public int m=1;
public int c=4;
public Mammal() {
	this('Y');
	System.out.println("parametresiz mammal");
}
public Mammal(char c) {
	super(17);
	System.out.println("parametreli mammal");
}
public void mM() {
	System.out.println("mammal");
}
public void mC() {
	System.out.println("mammal+cat");
}
}
