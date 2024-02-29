package demo1;

public class btap {
public static void main(String[] args) {
	int a=6;
	int b=++a;
	int c=b++;
	int d=++b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	int num1=6;
	int num2=7;
	int num3=6;
	int num4=7;
	System.out.println(num1 < num2 && num1++ > num2);// 6< 7, 6>7
	System.out.println(num3 > num4 && num3++ > num4);//Toán tử đoản mạch, không thực hiện vế sau
	System.out.println(num1);
	System.out.println(num3);
}
}
