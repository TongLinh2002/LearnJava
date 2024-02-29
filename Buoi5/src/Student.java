
public class Student {
     private String name ;
     private int age;
     private static String className="JW0124e1";
     
     
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public static String getClassName() {
		return className;
	}


	public static void setClassName(String className) {
		Student.className = className;
	}     
}
