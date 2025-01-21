package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx2 {//by map function we can apply operations

	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Stream<Integer> s=data.stream();
		s.map(n->n*n).forEach(n->System.out.println(n));

	}

}
