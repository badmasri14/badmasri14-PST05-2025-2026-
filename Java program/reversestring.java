package src;
import java.util.Scanner;
public class reversestring {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;       
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}
