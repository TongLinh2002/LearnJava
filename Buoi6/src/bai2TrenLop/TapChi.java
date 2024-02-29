package bai2TrenLop;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi() {
		super();
	}

	public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh,int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.soPhatHanh=soPhatHanh;
		this.thangPhatHanh=thangPhatHanh;
		
	}
	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
	}
	 public void hienThiThongTin() {
	        System.out.println("Tạp chí - Mã tài liệu: " + getMaTaiLieu() + ", Nhà xuất bản: " + getNhaXuatBan() +	                           
	                           ", Số bản phát hành: " + getSoBanPhatHanh() + ", Số phát hành: " + soPhatHanh +	                           
	                           ", Tháng phát hành: " + thangPhatHanh);
	
	 }
}
