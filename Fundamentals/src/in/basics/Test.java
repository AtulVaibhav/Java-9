package in.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
	int studentId;
	String studentName;
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}


public class Test {

	public static void main(String[] args) {
		// create student class object;
		//className objName = new className();
		
		Student s = new Student(101,"Harsh");
		
		Class c = s.getClass();
		System.out.println(c);
		
		Method[] methods = c.getDeclaredMethods();
		
		for(int i=0;i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
		
		Field[] fields = c.getDeclaredFields();
		for(int i=0;i<fields.length;i++) {
			System.out.println(fields[i].getName());
		}

	}

}
