import java.util.Arrays;
import java.util.List;


//Print the sum of all numbers
public class Problem1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
        int result = list.stream().reduce((a,b)->a+b).get();
        System.out.println(result);
	}

}
