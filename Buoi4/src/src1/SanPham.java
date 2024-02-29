package src1;

import java.util.Scanner;

public class SanPham {
//Bài tập: xây dựng lớp Product(sản phẩm tự chọn)
	/*
	 * Viết 1 phương thức đối tượng Product vs các dữ liệu nhập vào từ bàn phím sau
	 * đó thêm 3 đối tượng của lớp trên vào mảng và hiển thị chúng
	 */
	// sản phẩm là sách
	private String name;
	private double price;
	private int soluong;

	public SanPham(String name, double price, int soluong) {
		super();
		this.name = name;
		this.price = price;
		this.soluong = soluong;
	}
	   // Getter methods
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getSoluong() {
		return soluong;
	}
	  // Display method
	public void displaySanPham() {
		System.out.println("SanPham:" + name);
		System.out.println("Gia:" + price);
		System.out.println("SanPham:" + soluong);
		System.out.println("--------");
	}

	public static void main(String[] args) {
		// Tạo mảng để lưu trữ 3 đối tượng Product
		SanPham[] sp = new SanPham[3];
		Scanner sc = new Scanner(System.in);

		 // Nhập dữ liệu từ bàn phím và thêm vào mảng
		for (int i = 0; i < 3; i++) {
			System.out.println("SanPham:"+(i+1)+":");
			System.out.println("Name:");
			String name=sc.nextLine();
			
			System.out.println("Price:");
		    double price=sc.nextDouble();
			
			System.out.println("Số Lượng:");
			int soluong=sc.nextInt();
			// Đọc dòng trống sau khi đọc số nguyên để xử lý Enter
			sc.nextLine();
			 // Tạo đối tượng Product và thêm vào mảng
			sp[i]= new SanPham(name,price,soluong);
		}
		//Hiển thị thông tin đối tượng
		System.out.println("Hiển thị sản phẩm:");
		for(SanPham sps :sp) {
			sps.displaySanPham();
		}
	}
}
