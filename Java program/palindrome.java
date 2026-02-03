package pst;
import java.util.Scanner;

public class palindrome{
	 public static void main(String[] args) {
	        int num, temp, reverse = 0, sum = 0;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        num = sc.nextInt();

	        temp = num;
	        while (temp != 0) {
	            reverse = reverse * 10 + temp % 10;
	            temp = temp / 10;
	        }

	        if (num == reverse) {
	            temp = num;
	          
	            while (temp != 0) {
	                sum = sum + temp % 10;
	                temp = temp / 10;
	            }
	            System.out.println("Palindrome number");
	            System.out.println("Sum of digits = " + sum);
	        } else {
	            System.out.println("Not a palindrome number");
	        }
	    }
	

}

