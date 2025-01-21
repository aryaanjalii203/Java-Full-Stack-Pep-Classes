package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiReduce1{
	
	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Stream<Integer> s=data.stream();
		int mul=s.filter(n->n%2==0).map(n->n*2).reduce(1,(a,b)->a*b); //reduce(1,(a,b)) here u cannot give zero
		System.out.println(mul);

	}

}
