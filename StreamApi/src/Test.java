import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//filter
		//list.stream().filter(x->x%2==0).forEach(System.out::println);
        List<Integer> evenNumber = list.stream()
        		            .filter(x->x%2==0)
        		            .collect(Collectors.toList());
        System.out.println(evenNumber);
        
        //map
       List<Integer> result =  list.stream()
                             .filter(x->x%2==0)
                             .map(x->x*x)
                             .collect(Collectors.toList());
       System.out.println(result);
       
       List<Integer> list2 = Arrays.asList(4,2,2,1,1,3,3,8,8,4,7,6);
       list2.stream()
       .distinct()
       .sorted()
       .limit(2)
       .forEach(System.out::println);
       
       
       
       
	}

}
