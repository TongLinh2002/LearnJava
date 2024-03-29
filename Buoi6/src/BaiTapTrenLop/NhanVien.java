package BaiTapTrenLop;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, String gioiTinh, int tuoi, String diaChi, String congViec) {
		super(hoTen, gioiTinh, tuoi, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return "NhanVien [congViec=" + congViec + "]";
	}
	

	

}
