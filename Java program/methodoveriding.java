package src;
public class methodoveriding {

	public static void main(String[] args) {	
		B obj = new B();
		obj.CSE();
	}
	
}
class A{

	public static int CSE() {
		System.out.println("keerthika");
		return 0;
	
	}
	
}
class B extends A {
	public static int CSE() {
		System.out.println("nivi");
		return 0;
	}
		
	}
	
		
	

