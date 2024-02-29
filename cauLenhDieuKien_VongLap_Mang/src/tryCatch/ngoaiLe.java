package tryCatch;

import java.util.Scanner;

public class ngoaiLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		try {
			System.out.println("Nhap vao so nguyen n:");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung!");
		}
	     finally {
	    	 System.out.println("finally");
		}
		System.out.println("Gía trị nhâp là:" +n);
		System.out.println("Kết thúc chương trình!");
	}
}
