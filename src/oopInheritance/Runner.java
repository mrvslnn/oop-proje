package oopInheritance;

public class Runner {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.hareket();
		a1.icme();
		a1.yeme();
		
		Mammal m1=new Mammal();
		m1.dogum();
		m1.sutIleBesle();
		m1.yeme();
		m1.icme();
		m1.hareket();

		Cat c1=new Cat();
		c1.dogum();
		c1.hareket();
		c1.miyav();
		c1.sutIleBesle();
		c1.icme();
		c1.yeme();
		
		Dog d1=new Dog();
		d1.dogum();
		d1.hareket();
		d1.havla();
		d1.sutIleBesle();
		d1.icme();
		d1.yeme();
		
		Fish f1=new Fish();
		f1.hareket();
		f1.icme();
		f1.yeme();
		f1.yumurtla();
	}

}
