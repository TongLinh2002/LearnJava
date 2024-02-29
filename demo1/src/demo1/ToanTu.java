package demo1;

public class ToanTu {
public static void main(String[] args) {
	int number=123;
	String str="45";
	System.out.println(number + str);
	System.out.println((number + str) instanceof String);
	boolean boo =true;
	System.out.println(boo + str);
	
	//logic
	//AND =&
	System.out.println(true&& true);
	System.out.println(false&& true);
	System.out.println(true&& false);
	System.out.println(false&& false);
	
	//OR =||
	System.out.println(true|| true);
	System.out.println(false|| true);
	System.out.println(true|| false);
	System.out.println(false|| false);				
}
}
