package ctrucwhile;

import java.util.*;

public class viDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (number != 100) {
			System.out.println("Nhập số");
			number = sc.nextInt();
		}
		System.out.println(number);
		
		// do while
		int number1;
		do {
			System.out.println("Nhập số:");
			number1 = sc.nextInt();
		} while (number != 100);
		System.out.println(number1);
		sc.close();
	}
}
