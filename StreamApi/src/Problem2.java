import java.util.Arrays;
import java.util.List;

//Print average of all number
public class Problem2 {

	public static void main(String[] args) {
		List<Float> list = Arrays.asList(1.5f,2.4f,3.5f,4.6f,5.7f,6.2f);
//        double result = list.stream()
//        	    	.map(x->x)
//        		    .average()
//        		    .getAsDouble();
//        
//        System.out.println(result);
		
		float result = list.stream().reduce((a,b)->a+b).get();
		int num = (int) list.stream().count();
		
		System.out.println(result/num);
	}

}
