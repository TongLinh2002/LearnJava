package BaiTapTrenLop;

public class CongNhan extends CanBo{
	private String bac;

	public CongNhan() {
		super();
	}
	public CongNhan(String hoTen, String gioiTinh, int tuoi, String diaChi,String bac) {
		super(hoTen, gioiTinh, tuoi, diaChi);
		this.bac= bac;
	}
	
	
	public String getBac() {
		return bac;
	}
	
	public void setBac(String bac) {
		this.bac = bac;
	}
	
	@Override
	public String toString() {
		return "CongNhan [bac=" + bac + "]";
	}
	
}
