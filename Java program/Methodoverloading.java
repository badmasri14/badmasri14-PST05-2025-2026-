package src;

public class Methodoverloading {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println(badhu(a,b));
		System.out.println(badhu(a,b,c));

	}
	public static int badhu(int a,int b) {
		return 0;
	}
	public static int badhu(int a,int b,int c) {
		return 0;
	}

}
