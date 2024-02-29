package bai2TrenLop;

public abstract class TaiLieu {
	private String maTaiLieu;
	private String nhaXuatBan;
	private int soBanPhatHanh;
	
	public TaiLieu() {
		super();
	}

	public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}


    public abstract void hienThiThongTin();
	
}
