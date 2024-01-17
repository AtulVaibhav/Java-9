package com.fundamentals;

public class Operators {
    public void arithmeticOperator(){
    	int a = 10;
    	int b = 5;
    	
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a%b);
    	System.out.println(a/b);
    }
    
    public void unaryOperator(){
    	int a = 10;
    	int b = a++;
    	System.out.println(a+" "+b);
    	
    	int c = 20;
    	int d = ++c;
    	System.out.println(c+" "+d);
    	
    	int x = 100;
    	System.out.println(-x);
    	
    	boolean y = true;
    	System.out.println(!y);
    	
    }
    
    public void relationalOperator(){
    	int a = 10;
    	int b = 5;
    	int c= 10;
    	System.out.println(a==b);
    	System.out.println(a==c);
    	System.out.println(a!=b);
    	System.out.println(a>b);
    	System.out.println(a>=b);
    	System.out.println(a<c);
    	System.out.println(a<=c);
    }
    
    public void logicalOperator(){
    	int x=100;
    	int y = 200;
    	System.out.println((x!=y)&&(x>y));
    	System.out.println((x!=y)||(x>y));
    	System.out.println(!(x!=y)&&(x<y));
    }
    
    public void ternaryOperator(){
    	int x=10;
    	int y = 20;
    	boolean result = x<y?true:false;
    	System.out.println(result);
    	
    	System.out.println(!(x==y)?1:0);
    }
    
    public void shiftOperator(){
    	int x = 10;
    	System.out.println(x<<1);
    	
    	int y=10;
    	System.out.println(y>>1);
    }
    
    public void bitwiseOperator(){
    	int x=10;
    	int y=9;
    	System.out.println(x&y);
    	System.out.println(x|y);
    	System.out.println(x^y);
    	System.out.println(~x);//-(x+1)
    	System.out.println(~y);
    }
    
    public void instanceOfOperator(){
    	String str = "Hello";
    	System.out.println(str instanceof String);
    	//System.out.println(str instanceof Operators);
    }
	public static void main(String[] args) {
		Operators operators = new Operators();
		operators.arithmeticOperator();
		operators.unaryOperator();
		operators.relationalOperator();
		operators.logicalOperator();
		operators.ternaryOperator();
		operators.shiftOperator();
		operators.bitwiseOperator();
		operators.instanceOfOperator();

	}

}
