package BaiTapTrenLop;

import java.util.Arrays;
import java.util.Scanner;

public class QLCB{
	private CanBo[] cbs;
	private Scanner scanner;
	private int INDEX=0;

	public QLCB(CanBo[] cbs, Scanner scanner) {
		super();
		cbs=new CanBo[0];
		this.scanner = scanner;
		
	}
	public void themCanBo(int choice) {
		CanBo[] newCbs= Arrays.copyOf(cbs,cbs.length+1);
		newCbs[INDEX]=taoCanBo(choice);
		cbs=newCbs;
		INDEX++;
	}
	public void hienThiDanhSach() {
		for(CanBo cb: cbs) {
			if(cb!=null) {
				System.out.println(cb.toString());
			}
		}
	}
	public CanBo taoCanBo(int choice) throws RuntimeException{
		CanBo cb;
		System.out.println("Nhập tên: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int tuoi = Integer.parseInt(scanner.nextLine());
		String gioiTinh = choiceGender();
		System.out.println("Nhập địa chỉ: ");
		String diaChi = scanner.nextLine();
		if (choice == 1) {
			System.out.println("Nhập ngành đào tạo: ");
			String NganhDaoTao = scanner.nextLine();
			cb = new KySu(hoTen, gioiTinh,tuoi, diaChi, NganhDaoTao);
		} else if (choice == 2) {
			System.out.println("Nhập bậc: ");
			String bac = scanner.nextLine();
			cb = new CongNhan(hoTen, gioiTinh ,tuoi, diaChi ,bac);
		} else {
			System.out.println("Nhập công việc: ");
			String congViec = scanner.nextLine();
			cb = new NhanVien(hoTen, gioiTinh, tuoi, diaChi,congViec);
		}
		return cb;
	}

	private String choiceGender() {
		System.out.println("Chọn giới tính: ");
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. Khác");
		System.out.println("Nhập lựa chọn: ");
		int choiceGender = Integer.parseInt(scanner.nextLine());
		if (choiceGender == 1) {
			return "Nam";
		} else if (choiceGender == 2) {
			return "Nữ";
		} else {
			return "Khác";
		}
	}
}
	