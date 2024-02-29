package quanLyTaiLieu;

import java.util.ArrayList;
import java.util.Iterator;

public class quanLySach {
	private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();

	public void themMoiTaiLieu(TaiLieu taiLieu) {
		danhSachTaiLieu.add(taiLieu);
	}

	public void xoaTaiLieu(String maTaiLieu) {
		Iterator<TaiLieu> iterator = danhSachTaiLieu.iterator();
		while (iterator.hasNext()) {
			TaiLieu taiLieu = iterator.next();
			if (taiLieu.maTaiLieu.equals(maTaiLieu)) {
				iterator.remove();
				System.out.println("Đã xoá tài liệu có mã: " + maTaiLieu);
				return;
			}
		}
		System.out.println("Không tìm thấy tài liệu có mã: " + maTaiLieu);
	}

	public void hienThiThongTinTaiLieu() {
		for (TaiLieu taiLieu : danhSachTaiLieu) {
			taiLieu.hienThiThongTin();
			System.out.println("----------------------");
		}
	}

	public void timKiemTheoLoai(String loai) {
		System.out.println("Danh sách tài liệu loại " + loai + ":");
		for (TaiLieu taiLieu : danhSachTaiLieu) {
			if (taiLieu instanceof Sach && loai.equals("Sach")) {
				taiLieu.hienThiThongTin();
				System.out.println("----------------------");
			} else if (taiLieu instanceof TapChi && loai.equals("TapChi")) {
				taiLieu.hienThiThongTin();
				System.out.println("----------------------");
			} else if (taiLieu instanceof Bao && loai.equals("Bao")) {
				taiLieu.hienThiThongTin();
				System.out.println("----------------------");
			}
		}
	}

}
