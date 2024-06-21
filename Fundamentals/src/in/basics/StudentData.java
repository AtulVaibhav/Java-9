package in.basics;

public class StudentData{
    int studentId = 100;
    String studentName = "Harsh";
    
    @Override
    public String toString() {
    	return "StudentId:"+studentId+"  StudentName :"+studentName;
    }
	public static void main(String[] args) {
		StudentData s1 = new StudentData();
		System.out.println(s1);

	}

}
