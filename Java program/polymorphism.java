package src;

public class polymorphism {

	public static void main(String[] args) 
	{
		int a=25,b=45;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
	}
		
	public static int add(int c,int d)
	{
		return c+d;
	}
	public static int sub(int e,int f)
	{
		return e-f;
	}
	public static int mul(int g,int h)
	{
		return g*h;
	}
	public static int div(int i,int j) 
	{
		return i/j;
	}
}
		
	
	

