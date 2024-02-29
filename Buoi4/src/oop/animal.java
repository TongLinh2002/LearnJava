package oop;
// trong 1 file.java chỉ chứa 1 class public duy nhất và trùng tên với file
public class animal {
// đây là 1 lớp trong lập trình oop
	// trong lớp thường sẽ chứa 2 phần cơ bản property:thuộc tính của lớp, thể hiện cho đặc tính, tính chất của lớp đó
	//method : phương thức của lớp , thể hiện cho hành vi khả năng của lớp đó
	private double weight;//private chỉ dùng trong lớp
	double height;//dùng trong lớp , trong package
	protected String gender;//dùng trong lớp , trong package, có thể dùng ngoài package(cần thông qua lớp con kế thừa,
	int age;//dùng trong toán tử dự án 
	//contructer đầy đủ tham số
	//hàm khởi tạo
	public animal(double weight, double height, String gender, int age) {
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.age = age;
	}
	
	public animal(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public animal() {
		super();
	}
	 
}
