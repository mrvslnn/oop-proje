package oopOverride;

public class Cat extends Animal {

	@Override
	public void ses() {
		// TODO Auto-generated method stub
		System.out.println("kediler miyavlar");
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 1+2;
	}

	@Override
	public int multiply() {
		// TODO Auto-generated method stub
		return 1*2;
	}

	@Override
	public Cat create() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}

