package oopEncapsulation;

public class E02 {
	public static void main(String[] args) {
		E01 obj1=new E01();
	    System.out.println(obj1.getAge());
	    System.out.println(obj1.getName());
	    
	    obj1.setAge(33);
	    System.out.println(obj1.getAge());
	    
	    obj1.setName("ayse");
	    System.out.println(obj1.getName());
	   
}
}