package oop;

public class Human {

	private String name;
	private int age;
	private String gender;
	private String address;
	
	public Human() {
		super();
	}

	public Human(String name, int age, String gender, String address) {
		//this : chỉ đến lớp Human ở trên
		//super: dùng để truy cập đến thành phần cha gần nhất nó
		//cụ thẻ trường hợp này nó truy cập đến contructor
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public Human(int age) {
		super();
		this.age = age;
	}

	
}

