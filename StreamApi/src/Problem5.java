import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Print all numbers which start with 2
public class Problem5 {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,12,22,32,222,234,132,213);
	
	List<Integer> result = list.stream()
	             .map(x->String.valueOf(x))
	             .filter(x->x.startsWith("2"))
	             .map(x->Integer.parseInt(x))
                 .collect(Collectors.toList());
	System.out.println(result);
	}

}

/**
 * [2,3,1,2,3,1,2,3,3,2,2,1,3,4,5,6,7]
 * [2,3,1]
 * 
 * Mysql server in local system
 * 
 * 
 * forEach(System.out::println)
 */




