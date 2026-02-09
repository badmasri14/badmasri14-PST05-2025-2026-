package src;
import java.util.Scanner;

public class charvalue{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE ASCII VALUE:");
        int ascii = sc.nextInt();

        CharacterPrint obj = new CharacterPrint();
        obj.med1(ascii);

        sc.close();
    }
}

class CharacterPrint {

    public void med1(int ascii) {
        char ch = (char) ascii;
        System.out.println("Character = " + ch);
    }
}

