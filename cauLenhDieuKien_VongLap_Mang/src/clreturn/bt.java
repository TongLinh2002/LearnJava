package clreturn;

public class bt {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i<5)
					return;
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("----------------");
		}
	}
}
