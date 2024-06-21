package in.basics;

class EmployeeData{
	int empId;
	String empName;
	String empDept;
	public EmployeeData(int empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}
	
	public void getDetails() {
		System.out.println("EmployeeId "+empId+
				" EmployeeName: "+this.empName+" EmpDept:"+this.empDept);
	}
}

public class Practice_I {

	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData(101,"Harsh","Development");
		EmployeeData e2 = new EmployeeData(102,"Amit","Development");
		EmployeeData e3 = new EmployeeData(103,"Varun","Development");
		
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();

	}

}
