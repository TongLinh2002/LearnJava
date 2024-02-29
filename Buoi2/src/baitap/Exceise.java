package baitap;

public class Exceise {
	public static void main(String[] args) {
		// Viet chuong trình tính tổng các số nguyên tố nhỏ hơn 500
		// số nguyên tố là số chia hết cho 1 và chính nó
		// PA1: n chia các số từ 1-n, đếm ước
		// nếu ước =2=> SNT
		// PA2: chia n cho các số từ 2=> n-1,có chia hết thì n không phải số nguyên tố
		int n = 1;
		int sum = 0;
		while (n < 500) {
			if (n < 2) {
				n++;
				continue;
			} else {
				boolean flag = true;
				for (int i = 2; i <= n; i++) {
					if (n % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					sum += n;
				}
			}
			n++;
		}
		System.out.println(sum);
	}
}
