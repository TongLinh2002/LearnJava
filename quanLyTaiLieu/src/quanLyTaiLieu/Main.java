package quanLyTaiLieu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		quanLySach quanLySach = new quanLySach();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Thêm mới tài liệu");
			System.out.println("2. Xoá tài liệu theo mã");
			System.out.println("3. Hiện thị thông tin về tài liệu");
			System.out.println("4. Tìm kiếm tài liệu theo loại");
			System.out.println("5. Thoát");
			System.out.print("Chọn: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Clear buffer
			switch (choice) {
			case 1:
				System.out.println("Chọn loại tài liệu (Sach, TapChi, Bao): ");
				String loai = scanner.nextLine();
				System.out.println("Nhập mã tài liệu: ");
				String maTaiLieu = scanner.nextLine();
				System.out.println("Nhập tên nhà xuất bản: ");
				String tenNhaXuatBan = scanner.nextLine();
				System.out.println("Nhập số bản phát hành: ");
				int soBanPhatHanh = scanner.nextInt();
				scanner.nextLine(); // Clear buffer
				switch (loai.toLowerCase()) {
				case "Sach":
					System.out.println("Nhập tên tác giả: ");
					String tenTacGia = scanner.nextLine();
					System.out.println("Nhập số trang: ");
					int soTrang = scanner.nextInt();
					quanLySach.themMoiTaiLieu(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
					break;
				case "TapChi":
					System.out.println("Nhập số phát hành: ");
					int soPhatHanh = scanner.nextInt();
					System.out.println("Nhập tháng phát hành: ");
					int thangPhatHanh = scanner.nextInt();
					quanLySach.themMoiTaiLieu(
							new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
					break;
				case "bao":
					System.out.println("Nhập ngày phát hành: ");
					String ngayPhatHanh = scanner.nextLine();
					quanLySach.themMoiTaiLieu(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
					break;
				default:
					System.out.println("Không hợp lệ!");
				}
				break;
			case 2:
				System.out.println("Nhập mã tài liệu cần xoá: ");
				String maTaiLieuCanXoa = scanner.nextLine();
				quanLySach.xoaTaiLieu(maTaiLieuCanXoa);
				break;
			case 3:
				quanLySach.hienThiThongTinTaiLieu();
				break;
			case 4:
				System.out.println("Nhập loại tài liệu cần tìm kiếm (Sach, TapChi, Bao): ");
				String loaiTimKiem = scanner.nextLine();
				quanLySach.timKiemTheoLoai(loaiTimKiem);
				break;
			case 5:
				System.out.println("Thoát khỏi chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ!");
			}
		} while (choice != 5);
		scanner.close();
	}
}
