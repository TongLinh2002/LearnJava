package BaiTapTrenLop;

public class CanBo {
	protected String hoTen;
	protected String gioiTinh;
	protected int tuoi;
	protected String diaChi;
	
	public CanBo() {
		super();
	}
	
	public CanBo(String hoTen, String gioiTinh, int tuoi, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", diaChi=" + diaChi;
	}
	
}
