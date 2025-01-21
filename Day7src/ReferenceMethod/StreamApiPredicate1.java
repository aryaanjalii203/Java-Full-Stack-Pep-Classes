package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiPredicate1{//Predicate Functional Interface

	public static void main(String[] args) {
		Predicate<Integer> pred=new Predicate<Integer>() {//With the help of predicate we can also write in this way

			@Override
			public boolean test(Integer t) {
			
				return t%2==0;
			}
		};
	
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Stream<Integer> s=data.stream();
		s.filter(pred).map(n->n*2).forEach(n->System.out.println(n));

	}

}
