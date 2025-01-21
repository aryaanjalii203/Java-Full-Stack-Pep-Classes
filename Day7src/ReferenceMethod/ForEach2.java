package ReferenceMethod;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach2 {//Consumer Functional Interface
	
	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		Consumer<Integer> s=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(s);
				
			}
			
		};
		
		data.forEach(n->System.out.println(n));
		
	}

}
