package bai2TrenLop;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;


	public Sach() {
		super();
	}
	
	public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh,String tenTacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.tenTacGia=tenTacGia;
		this.soTrang=soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + "]";
	}
	  public void hienThiThongTin() {
	        System.out.println("Sách - Mã tài liệu: " + getMaTaiLieu() + ", Nhà xuất bản: " + getNhaXuatBan() +	                           
	       ", Số bản phát hành: " + getSoBanPhatHanh() +  ", Tác giả: " + tenTacGia +", Số trang: " + soTrang);	                          
	  }
}
