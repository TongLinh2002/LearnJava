package doWhile;

import java.util.Scanner;

public class baitap {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao n> 0:");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
