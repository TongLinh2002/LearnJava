package cauLenhReNhanh;

//public class continute {
//	public static void main(String[] args) {
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if (i < 50)
//				continue;
//			System.out.println(i);
//		}
//	}
//}
//public class continute {
//	public static void main(String[] args) {
//		 int max = 100;
//		 for (int out = 0; out < 10; out++) 
//		loop: for (int i = 0; i < max; i++) {
//			if (i < 50)
//				continue loop;
//			System.out.println(i);
//		}
//		System.out.println("Ketqua");
//	}
//}
public class continute {
	public static void main(String[] args) {
		outer:for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i<5)
					continue outer;
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("----------------");
		}
	}
}
