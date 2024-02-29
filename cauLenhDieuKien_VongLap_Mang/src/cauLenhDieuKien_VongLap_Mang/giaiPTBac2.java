package cauLenhDieuKien_VongLap_Mang;

import java.util.Scanner;

//import java.util.Scanner;
//
//public class giaiPTBac2 {
//// giải phuong trinh bac 2
//	/*
//	 *ax^2 + bx + c =0
//	 *cac bien can co a,b,c,x1,x2,delta
//	 *Neu a==0 bao loi
//	 *B1. delta= b^2-4ac
//	 *B2. kiem tra delta 
//	 *   2.1 delta < 0 => PT vo nghiem
//	 *   2.2 delta =0 => PT co nghiem kep x1=x2=-b/2a
//	 *   2.3 delta> 0 =>PT co 2 nghiem phan biet 
//	 *   x1= (-b-sqrt(delta))/(2a);
//	 *   x2=(-b+sqrt(delta))/(2a)
//	 */
//	
//	public static void main(String[] args) {
//	  double a,b,c, x1,x2,delta;
//	  Scanner sc= new Scanner(System.in);
//	  
//	  System.out.println("Nhap a:");
//	  a=sc.nextDouble();
//	  System.out.println("Nhap b:");
//	  b=sc.nextDouble();
//	  System.out.println("Nhap c:");
//	  c=sc.nextDouble();
//	  
//	  delta= Math.pow(b, 2)-4*a*c;
//	  if(a==0) {
//		  System.out.println("Nhap du lieu sai");
//	  }else {			  
//	  if(delta<0) {//thu a=1,b=2,c=3
//		  //Tinh huong delta < 0
//		  System.out.println("phuong trinh vo nghiem");
//	  }else if(delta==0) {// thu a=1,b=2,c=1
//		  //Tinh huong delta ==0
//		  x1=-b/(2*a);
//		  System.out.println("phuong trinh co nghiem kep x1=x2="+x1);
//	  
//	  }else {
//		  //Tinh huong delta >0
//		  //thu a=1,b=5,c=1
//		  x1=(-b-Math.sqrt(delta))/(2*a);
//		  x2=(-b+Math.sqrt(delta))/(2*a);
//		  System.out.println("phuong trinh co nghiem kep x1="+x1);
//		  System.out.println("phuong trinh co nghiem kep x2="+x2);
//	  }
//	}
//}
public class giaiPTBac2 {
	public static void main(String[] args) {
		// giai phuong trinh bac 2
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a:");
		a = sc.nextDouble();
		System.out.println("Nhap b:");
		b = sc.nextDouble();
		System.out.println("Nhap c:");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - (4 * a * c);
		if (a == 0) {
			System.out.println("Du lieu nhap sai!1");
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if (delta == 0) {
				x1 = x2 = (-b) / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x1=x2=" + x1);
			} else {
				x1 = (-b - Math.sqrt(delta) / (2 * a));
				x2 = (-b + Math.sqrt(delta) / (2 * a));
				System.out.println("Phuong trinh co nghiem x1=" + x1);
				System.out.println("Phuong trinh co nghiem x2=" + x2);
			}

		}
	}
}
