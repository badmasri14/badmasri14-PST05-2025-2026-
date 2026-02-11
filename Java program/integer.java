package src;

public class integer {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Integer: " + num);
        IntToString obj = new IntToString();
        obj.convert();
    }
}
class IntToString {
	public void convert() {
		int num = 1234;
		String str = "";
        while (num > 0) {
            int digit = num % 10;
            char ch = (char) (digit + '0'); 
            str = ch + str;
            num = num / 10;
        }
        System.out.println("String: " + str);
    }
}

    	

