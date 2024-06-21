package in.basics;

class Rectangle{
	int length;
	int breadth;
	 
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		System.out.println(this.length*this.breadth);
	}
}
public class This_III {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12,12);
		rectangle.getArea();

	}

}
