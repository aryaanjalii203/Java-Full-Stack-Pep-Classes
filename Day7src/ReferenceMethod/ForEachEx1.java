package ReferenceMethod;


import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {
	
	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		data.forEach(n->System.out.println(n));
		
	}

}
