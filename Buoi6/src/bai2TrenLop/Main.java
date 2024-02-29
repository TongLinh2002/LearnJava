package bai2TrenLop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	QuanLySach quanLy = new QuanLySach();
	Scanner scanner = new Scanner(System.in);
	int choice;
	do
	{
		System.out.println("------ Quản Lý Tài Liệu ------");
		System.out.println("1. Thêm mới tài liệu");
		System.out.println("2. Xoá tài liệu theo mã");
		System.out.println("3. Hiển thị thông tin về tài liệu");
		System.out.println("4. Tìm kiếm tài liệu theo loại");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn của bạn: ");
		choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			System.out.println("Chọn loại tài liệu (Sách/Tạp chí/Báo): ");
			String loai = scanner.nextLine();
			System.out.println("Nhập mã tài liệu: ");
			String maTaiLieu = scanner.nextLine();
			System.out.println("Nhập tên nhà xuất bản: ");
			String nhaXuatBan = scanner.nextLine();
			System.out.println("Nhập số bản phát hành: ");
			int soBanPhatHanh = scanner.nextInt();
			scanner.nextLine(); 

			if (loai.equalsIgnoreCase("Sách")) {
				System.out.println("Nhập tên tác giả: ");
				String tenTacGia = scanner.nextLine();
				System.out.println("Nhập số trang: ");
				int soTrang = scanner.nextInt();
				quanLy.taoTaiLieu(new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
			} else if (loai.equalsIgnoreCase("Tạp chí")) {
				System.out.println("Nhập số phát hành: ");
				int soPhatHanh = scanner.nextInt();
				System.out.println("Nhập tháng phát hành: ");
				int thangPhatHanh = scanner.nextInt();
				quanLy.taoTaiLieu(new TapChi(maTaiLieu, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
			} else if (loai.equalsIgnoreCase("Báo")) {
				System.out.println("Nhập ngày phát hành: ");
				String ngayPhatHanh = scanner.nextLine();
				quanLy.taoTaiLieu(new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayPhatHanh));
			} else {
				System.out.println("Lựa chọn không hợp lệ");
			}
			break;

		case 2:
			System.out.println("Nhập mã tài liệu cần xoá: ");
			String maXoa = scanner.nextLine();
			quanLy.xoaTaiLieu(maXoa);
			break;

		case 3:
			System.out.println("Thông tin về tất cả các tài liệu trong thư viện: ");
			quanLy.hienThiThongTin();
			break;

		case 4:
			System.out.println("Chọn loại tài liệu cần tìm (Sách/Tạp chí/Báo): ");
			String loaiTimKiem = scanner.nextLine();
			quanLy.timKiemTheoLoai(loaiTimKiem);
			break;

		case 5:
			System.out.println("Thoát chương trình.");
			break;

		default:
			System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			break;
		}

	}while(choice!=5);

	scanner.close();
   }
}
