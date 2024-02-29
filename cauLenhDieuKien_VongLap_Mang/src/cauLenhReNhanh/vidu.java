package cauLenhReNhanh;

public class vidu {
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;
//			}
//			System.out.println("ben trong vong lap lon :out=" + out + ",in=" + in);
//		}
//		System.out.println("ben ngoài vong lap lon :out=" + out + ",in=" + in);
//	}
// có label
	public static void main(String[] args) {
		int out, in = 0;
		outer:for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break outer;
			}
			System.out.println("ben trong vong lap lon :out=" + out + ",in=" + in);
		}
		System.out.println("ben ngoài vong lap lon :out=" + out + ",in=" + in);
	}
}
