package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiReduce {
	
	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Stream<Integer> s=data.stream();
		int add=s.filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
		System.out.println(add);

	}

}
