package Queue;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(5);
		hs.add(40);
		hs.add(9);
		hs.add(12);
		hs.add(63);
		hs.add(45);
		hs.add(null);
		hs.add(8);//it wouldn't override the same element(no duplicates)
		
		hs.forEach((i)->System.out.println(i));//java 8 feature to write concise code
	}


	

}
