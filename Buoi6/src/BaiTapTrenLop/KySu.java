package BaiTapTrenLop;

public class KySu extends CanBo {
	private String nganhDaoTao;

	
	public KySu() {
		super();
	}


	public KySu(String hoTen, String gioiTinh, int tuoi, String diaChi, String nganhDaoTao) {
		super(hoTen, gioiTinh, tuoi, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}


	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}


	@Override
	public String toString() {
		return "KySu [nganhDaoTao=" + nganhDaoTao + "]";
	}
	

}
