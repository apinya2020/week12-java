package week12;

public class Student1 {
	int rollno; //instance variable
	String name;//instance variable
	static String college="IT"; //static variable
	//constructor
	Student1(int r, String n ){
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno + " " + name + college);
	}
}
