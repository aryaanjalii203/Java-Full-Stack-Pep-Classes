package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiReduce2{
	
	//Here we have 3 streams and have performed different operations on every stream
	
	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Stream<Integer> s=data.stream();
		int add=s.filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
		System.out.println(add);
		Stream<Integer> s1=data.stream();
		int max=s1.reduce(0, (a,b)->a>b?a:b);
		System.out.println(max);
		Stream<Integer> s2=data.stream();
		int min=s2.reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b); //min value
		System.out.println(min);

	}

}
