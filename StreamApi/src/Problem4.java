import java.util.Arrays;
import java.util.List;

//Print average of squared even number
public class Problem4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		double result = list.stream()
				        .filter(x->x%2==0)
				        .mapToInt(x->x)
				        .average()
				        .getAsDouble();
        System.out.println(result);
	}

}
