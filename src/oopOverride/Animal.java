package oopOverride;

public class Animal {
	public void ses() {
		System.out.println("kediler miyavlar");
	}
	
	public int add() {
	//return super.add();
		return 3+4;
	}

	public int multiply() {
		return 3*4;
	}
	public Animal create() {
		return new Animal();
	}
	public final void eat() {
		System.out.println("yerler");
	}
}
