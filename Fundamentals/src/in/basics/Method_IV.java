package in.basics;

public class Method_IV {
    public static int getSum(int i,int sum) {
    	if(i>=7) {
    		return sum;
    	}
    	i = i+1;
    	return getSum(i,sum+i);
    }
	public static void main(String[] args) {
		int n=0;
		int sum=0;
		System.out.println(getSum(n,sum));

	}

}
