package src;
import java.util.Scanner;
public class Aschii {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	System.out.println("ENTER THE CHARACTER:");
	  char ch = sc.next().charAt(0);

      character obj = new character();  
      obj.med1(ch); 
	}

}
class character{
	public void med1(int ch){
		 System.out.println("ASCII value = " + (int)ch);
    
    }
}



	        






	



