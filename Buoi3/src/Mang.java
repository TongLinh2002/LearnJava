
public class Mang {
	public static void main(String[] args) {
		int[] ints = {};
		int[] ints1 = { 5, 6, 7 };
		System.out.println(ints1[2]);
		System.out.println(ints1.length);
		for (int i = 0; i < ints1.length; i++) {
			System.out.println("Vị trí" + i + "Gia tri" + ints1);

		}
		for (int value : ints1) {
			System.out.println(value);
		}
		//Thêm phần tử vào trong mảng
		System.out.println("-----------");
		int[]  newArr= new int[ints1.length +1];
		for (int i=0;i<ints1.length;i++) {
			if(i<2) {
				newArr[i] =ints1[i];
				
			}else if(i>2) {
				newArr[i +1] =ints1[i];
			}
		}
		newArr[2]=100;
		for(int value:ints1) {
			System.out.println(value);
		}
		//Khai báo phần tử mảng bằng khóa new
		System.out.println("-----------");
		int[] ints2=new int[5];
		System.out.println(ints1.length);
		System.out.println(ints2[2]);
		System.out.println(ints2[4]);
		//System.out.println(ints2[10]), đây là khai báo quá độ dài
	}
}
