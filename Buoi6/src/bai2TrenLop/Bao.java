package bai2TrenLop;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
		// TODO Auto-generated constructor stub
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + "]";
	}

	public void hienThiThongTin() {
		System.out.println("Báo - Mã tài liệu: " + getMaTaiLieu() + ", Nhà xuất bản: " + getNhaXuatBan()
				+ ", Số bản phát hành: " + getSoBanPhatHanh() + ", Ngày phát hành: " + ngayPhatHanh);
	}

}
