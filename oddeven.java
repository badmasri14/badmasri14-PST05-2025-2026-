package pst;
import java.util.Scanner;

public class oddeven
{
	public static void main(String[] args) {

		 try (Scanner sc = new Scanner(System.in)) {
	            int[] a = new int[5];

	            for (int i = 0; i < 5; i++)
	                a[i] = sc.nextInt();

	            for (int i = 0; i < 5; i++)
	                System.out.println(a[i] + ((a[i] % 2 == 0) ? " Even" : " Odd"));
	        }
	    }
	}
