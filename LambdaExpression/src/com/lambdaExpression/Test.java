package com.lambdaExpression;

@FunctionalInterface
interface A{
	//void m1();
	//int show();
   // int add(int a,int b);
	
	int minElement(int[] arr);
}

//class AImpl implements A{
//
//	@Override
//	public void m1() {
//		System.out.println("m1() is called");
//		
//	}
//	
//}
public class Test {

	public static void main(String[] args) {
//		A obj = new AImpl();
//		obj.m1();
		
//		A obj = ()->{System.out.println("m1() is called");};
//		
//		obj.m1();
		
//		A obj = ()->{return 1;};
//		System.out.println(obj.show());
//		
//		A obj = (a,b)->{return a+b;};
//		System.out.println(obj.add(12, 13));
		
		A obj = (arr)->{
			int min = 0;
			for(int data:arr){
				if(data<min){
					min = data;
				}
			}
			return min;
		};
		int[] arr={2,1,-1,3,4};
		System.out.println(obj.minElement(arr));

	}

}
