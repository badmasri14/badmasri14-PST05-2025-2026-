package src; 
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double P = sc.nextDouble(); 
        double R = sc.nextDouble(); 
        double T = sc.nextDouble(); 

        
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest: " + SI);

        sc.close();
    }
}