package vongLapFor;

public class inBangCuuChuong {
	public static void main(String[] args) {
		/*
		 * 2*1=2 2*2=4 ... 2*10=20
		 */
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("----------------");
		}

	}
}
