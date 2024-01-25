package com.fundamentals;
class Java{
	Java(){
		System.out.println("Value of this :"+this.hashCode());
	}
}
public class This_Keyword {

	public static void main(String[] args) {
		Java obj = new Java();
		System.out.println("Value of obj :"+obj.hashCode());
		
		Java obj2 = new Java();
		System.out.println("Value of obj2 :"+obj2.hashCode());

	}

}
