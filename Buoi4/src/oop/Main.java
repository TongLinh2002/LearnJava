package oop;

public class Main {
	public static void main(String[] args) {
		// khởi tạo 1 đối tượng Animal từ lớp Animal
		animal Animal= new animal();
		System.out.println(Animal.age);
		System.out.println(Animal.gender);
		
		animal Animal1= new animal(20.5,0.6,"male",2);
		System.out.println(Animal1.age);
		System.out.println(Animal1.gender);
		System.out.println(Animal1.height);
		//System.out.println(Animal1.weight); weight nằm trong thuộc tính private
	}
}
