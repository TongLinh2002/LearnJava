package bai2TrenLop;

import java.util.Arrays;
import java.util.Scanner;

import BaiTapTrenLop.CanBo;

public class QuanLySach {
	private TaiLieu[] tls;
	private Scanner  scanner;
	private int Index =0;

	public QuanLySach(TaiLieu[] tls, Scanner scanner) {
		super();
		this.tls = tls;
		this.scanner = scanner;
	}
	
	public void themTaiLieu(int choice) {
		TaiLieu[] newTls=Arrays.copyOf(tls, tls.length+1);
		newTls[Index]=taoTaiLieu(choice);
		tls=newTls;
	}
	public void hienThiDanhSach() {
		for(TaiLieu tl: tls) {
			if(tl!=null) {
				System.out.println(tl.toString());
			}
		}
	}
	public TaiLieu taoTaiLieu(int choice) {
		TaiLieu tl;
		System.out.println("Mã tài liệu:");
		String maTaiLieu=scanner.nextLine();
		System.out.println("Nhà xuất bản:");
		String nhaXuatBan=scanner.nextLine();
		System.out.println("Số bản phát hành:");
		int soBanPhatHanh=Integer.parseInt(scanner.nextLine());
		if(choice ==1) {
			System.out.println("");
		}else if() {
			
		}else {
			
		}
		return tl;
	}
}

