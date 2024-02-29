package cauLenhDieuKien_VongLap_Mang;

import java.util.Scanner;

//ptb1 : ax+ b= 0
/*
 * neu a= 0 
 *     neu b= 0 => pt vo so nghiem
 *     neu b!=0 => phuong trinh vo nghiem
 *neu a!=0
 *   co nghiem x=-b/a     
 */

public class BaiTapGiaiPTbac1 {
	public static void main(String[] args) {
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a:");
		a = sc.nextDouble();
		System.out.println("Nhap b:");
		b = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiem!");
			}
		} else {
			x = -b / a;
			System.out.println("nghiem Pt: x=" + x);
		}

	}
}
