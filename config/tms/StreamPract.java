package tms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPract {
	
	
	public void str() {
		
		int ar[]= {1,2,3,4,56,7};
		
		List<Integer> l= IntStream.of(ar).distinct().sorted().boxed().collect(Collectors.toList());
		
		List<Integer> ee= Arrays.stream(ar).distinct().sorted().boxed().collect(Collectors.toList());
				
				int[] no = {1, 2, 3, 5, 34, 6, 6};

        List<Integer> sortedList = IntStream.of(no)  // Convert the int[] to an IntStream
                                            .distinct()   // Remove duplicates
                                            .sorted()     // Sort the elements
                                            .boxed()      // Convert each int to an Integer
                                            .collect(Collectors.toList()); // Collect to a List

        System.out.println(sortedList);
        
        String[] strArray = {"apple", "banana", "apple", "orange"};

        List<String> strList = Arrays.stream(strArray) // Convert the array to a Stream
                                     .distinct()      // Remove duplicates
                                     .sorted()        // Sort the strings
                                     .collect(Collectors.toList());
        
        try {
			Arrays.stream(ar).max().orElseThrow(()-> new Exception("no"));// no value or supplier for orelsethrow
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<int[]> g = Arrays.asList(no);
		
		//longest String
		List<String> strings = Arrays.asList("abc", "bcdjs");
		//strings.stream().max(Comparator<.>)
		
		//.max(Integer:: compareTo)
		//.sorted(Comparator.reverseOrder())
		//.stream().filter(i-> i%2==0).collect(Collectors.toList())
		//map take function
		//filter take predicate
		
		
		//.stream().map(s->s+"").filter(s-> s.startWith("1")).collect(Collecors.toList());
		
		
		
		//2nd day
		List<Integer> i=new ArrayList<>();
		i.add(9);
		List<Integer> d = Arrays.asList(1, 2, 13, 4, 5, 67, 8);
		
		d.stream().filter(id-> id%2==0).collect(Collectors.toList());
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
            .filter(n -> n%2 == 0)
            .forEach(System.out::println);
		//Arrays.stream(arr)
        
        
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 1);

        // Step 1: Create a frequency map
        Map<Integer, Long> frequencyMap = integers.stream()
                .collect(Collectors.groupingBy(
                        Integer::intValue, 
                        Collectors.counting()
                ));
        
        // Step 2: Find duplicates (where frequency > 1)
//        Set<Integer> duplicates = frequencyMap.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toSet());
//        integers.stream().collect(Collectors.groupingBy(i, Collectors.counting()));
//        
        
        integers.stream().sorted(Collections.reverseOrder()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        
        ages.stream()
        .sorted((age1, age2) -> age2 - age1)  // Sorts in reverse (descending) order
        .collect(Collectors.toList());
        
        Optional<Integer> maxAge = ages.stream()
                .max((age1, age2) -> age1 > age2 ? 1 : (age1.equals(age2) ? 0 : -1));
        

		
		
		
		d.stream().map(s->s+"").filter(s-> s.startsWith("1")).collect(Collectors.toList());
		
		d.stream()
        .map(s -> s + "") // Convert integer to String
        .filter(s -> s.startsWith("1"))
        .forEach(System.out::println);
		
	//	d.stream().distinct().collect(null)
		
		
		
		
		
	}
	//Primitive Arrays: Use Arrays.stream(intArray) for streams of primitives.
	//Object Arrays: Use either Arrays.stream(array) or Stream.of(array) to convert an array to a stream.

	public static void main(String[] args) {}

}
