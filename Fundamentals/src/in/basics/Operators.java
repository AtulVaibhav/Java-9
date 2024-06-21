package in.basics;

public class Operators {
   public static void arithmeticOperators() {
	   System.out.println("Arithmetic Operators");
	   int a = 10;
	   int b = 7;
	   
	   System.out.println(a+b);
	   System.out.println(a-b);
	   System.out.println(a*b);
	   System.out.println(a/b);//quotient
	   System.out.println(a%b);// remainder
	   System.out.println("______________________________");
   }
   
   public static void relationalOperators() {
	   //returns boolean
	   System.out.println("Relational Operators");
	   int x = 10;
	   int y = 20;
	   System.out.println(x>y);
	   System.out.println(x>=y);
	   System.out.println(x<y);
	   System.out.println(x<=y);
	   System.out.println(x==y);
	   System.out.println(x!=y);
	   System.out.println("_________________________________");
   }
   
   public static void logicalOperators() {
	   System.out.println("Logical Operators");
	   int x = 10;
	   int y = 20;
	   
	   System.out.println(x>y&&x==y);
	   System.out.println(!(!(x<y||x!=y)||(x==y)));
	   System.out.println(!((x!=y)||(!(x>y))));
	   System.out.println("________________________");
   }
   
   public static void ternaryOperator() {
	   System.out.println("Ternary Operator");
	   int x=10;
	   int y=20;
	   
	   boolean result = x<y?(x==y):(x>y);
	   System.out.println(result);
	   
	   boolean result2 = x<y?(x==y)?x>y:x<=y:x!=y;
	   System.out.println(result2);
	   System.out.println("_____________________");
   }
   
   public static void assignmentOperator() {
	   System.out.println("Assignment Operator");
	   int x=10;
	   int y = (x*x);
	   System.out.println(x+" "+y);
	   
	   //+=
	   int a = 10;
	   a +=20;// a = a+20
	   System.out.println(a);
	   System.out.println("__________________");
   }
    public static void unaryOperator() {
    	//++ , --, -
    	
    	int a = 10;
    	int b = ++a;//a = a+1=11;  b=a
    	System.out.println(a+" "+b);
    	
    	int x=20;
    	int y = ++x + x++;
    	System.out.println(x+" "+y);//22 42,
    	
    	
    	int z =10;
    	z = z++ + ++z;
    	System.out.println(z);//22,
    	System.out.println("____________");
    	
    }
    
    public static void bitwiseOperator() {
    	System.out.println("Bitwise Operator");
    	int x = 12;
    	int y = 25;
    	System.out.println(x&y);
    	System.out.println(x|y);
    	System.out.println(x^y);
    	System.out.println("________________");
    }
    
    public static void shiftOperator() {
    	System.out.println("Shift Operator");
    	
    	System.out.println(10<<3);//<< left shift
    	System.out.println(20>>2);//>>right shift
    	System.out.println("_________________");
    }
    
    public static void instanceOF() {
    	System.out.println("INSTACEOF ");
    	Integer a = new Integer(10);
    	System.out.println(a instanceof Integer);
    }
   
   
   
   
	public static void main(String[] args) {
		Operators.arithmeticOperators();
		Operators.relationalOperators();
		Operators.logicalOperators();
		Operators.ternaryOperator();
        Operators.assignmentOperator();
        Operators.unaryOperator();
        Operators.bitwiseOperator();
        Operators.shiftOperator();
        Operators.instanceOF();
	}

}
