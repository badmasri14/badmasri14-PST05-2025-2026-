package src;

public class department 
{
	public static void main(String[] args) 
	{
		Second obj=new Second();
		obj.Cse4();
		obj.Cse3();
		Third obj2=new Third();
		obj2.Cse5();
		obj2.Cse6();
	}
} 
class Second{
	public static void Cse3() 
	{
		System.out.println("Computer science 3");
		
	}
	public static void Cse4() 
		{
			System.out.println("Computer science 4");
		}
	}
class Third{
	public static void Cse5()
    {
		System.out.println("Computer science 5");
	}
	public static void Cse6()
	{
		System.out.println("Computer science 6");
	}
}