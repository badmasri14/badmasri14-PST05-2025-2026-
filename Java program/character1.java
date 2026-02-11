package src;

public class character1{
	public static void main (String[]args) {
		char ch='B';
		System.out.println("character:"+ch);
		charToString obj= new charToString();
		obj.convert();
	}

}
class charToString{
	public void convert() {
		char ch='B';
		String str="";
		str=str+ch;
		System.out.println("String:"+str);
		
	}
	
}
