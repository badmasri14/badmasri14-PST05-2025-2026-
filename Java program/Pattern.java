package src;

public class Pattern
{
	public static void main(String[] args) 
	{
		StarPattern s =new StarPattern();
	    System.out.println("Horizontal Pattern:");
        s.horizontalStars();

        System.out.println("\nVertical Pattern:");
        s.verticalStars();
    }
}
class StarPattern {
 void horizontalStars() {
     int n = 5;
     for (int i = 1; i <= n; i++) {
         System.out.print("* ");
     }
 }
 void verticalStars() {
     int n = 5;
     for (int i = 1; i <= n; i++) {
         System.out.println("*");
     }
 }
}

               
   


