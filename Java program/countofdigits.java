package src;
import java.util.Scanner;
public class countofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                count++;
                num = num / 10;
            }
        }
        System.out.println("Count of digits: " + count);
        sc.close();
    }
}



