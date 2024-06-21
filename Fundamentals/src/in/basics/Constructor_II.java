package in.basics;

class StudentInfo{
	int studentId;
	String studentName;
	
	public StudentInfo(int id,String name) {
		studentId = id;
		studentName = name;
	}
	
	@Override
	public String toString() {
		return "StudentId: "+studentId+" StudentName: "+studentName;
	}
}

public class Constructor_II {

	public static void main(String[] args) {
	   StudentInfo s1 = new StudentInfo(101,"Harsh");
	   StudentInfo s2 = new StudentInfo(102,"Amit");
	   
	   System.out.println(s1);
	   System.out.println(s2);

	}

}
