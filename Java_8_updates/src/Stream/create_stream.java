package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class create_stream {
   public static void main(String []args) {
	 List<String> list= Arrays.asList("apple","mango","banana");
	 Stream<String> myStream = list.stream(); //---> converted collections to stream
	 
	 String[] array = {"apple", "mango","cherry"};
	 Stream<String> stream = Arrays.stream(array); //---> converted array into stream
	 
	 Stream<Integer> IntStream = Stream.of(1,2,3); //---> direct creation of stream
	 
	 Stream<Integer> limit = Stream.iterate(0, n ->n+1).limit(5); //--->when we want to iterate
	 
	 Stream<String> string = Stream.generate(()->"hello").limit(3); //---> when we want to generate 
   }
}
