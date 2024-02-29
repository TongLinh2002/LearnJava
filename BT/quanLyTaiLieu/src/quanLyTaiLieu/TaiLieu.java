package quanLyTaiLieu;

public class TaiLieu {
	 protected String maTaiLieu;
	    protected String tenNhaXuatBan;
	    protected int soBanPhatHanh;

	    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
	        this.maTaiLieu = maTaiLieu;
	        this.tenNhaXuatBan = tenNhaXuatBan;
	        this.soBanPhatHanh = soBanPhatHanh;
	    }

	    public void hienThiThongTin() {
	        System.out.println("Mã tài liệu: " + maTaiLieu);
	        System.out.println("Tên nhà xuất bản: " + tenNhaXuatBan);
	        System.out.println("Số bản phát hành: " + soBanPhatHanh);
	    }
}
