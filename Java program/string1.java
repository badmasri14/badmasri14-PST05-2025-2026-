package src;
public class string1 {
	    public static void main(String[] args) {
	        String s = "1234";
	        System.out.println("String: " + s);
	        StringToInteger obj = new StringToInteger();
	        obj.convert();
	    }
	}
	class StringToInteger{
	    public void convert() {
	        String s = "1234";
	        int num = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            int digit = ch - '0';   
	            num = num * 10 + digit;
	        }
	        System.out.println("Integer: " + num);
	    }
	}
