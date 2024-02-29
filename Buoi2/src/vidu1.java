
public class vidu1 {
	public static void main(String[] args) {
		int a = 7;
		if (a > 10) {
			System.out.println(a + "Lớn hơn 10");
		} else if (a < 5) {
			System.out.println(a + "Nhỏ hơn 5");
		} else {
			System.out.println(a);
		}

		// if lồng
		int b = 10;
		if (b > 10) {
			if (b > 20) {
				System.out.println(b + "Lớn hơn 20");
			} else {
				System.out.println(a + "Nhỏ hơn 20,lớn hơn 10");

			}
		} else {
			System.out.println(a + "Nhỏ hơn 10");
		}
	}
}
