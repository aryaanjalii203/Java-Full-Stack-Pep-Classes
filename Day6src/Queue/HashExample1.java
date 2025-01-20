package Queue;

import java.util.HashSet;

public class HashExample1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(100);
		hs.add(460);
		hs.add(9);
		hs.add(29);
		hs.add(8);
		hs.add(46);
		hs.add(null);
		hs.add(29);//it wouldn't override the same element(no duplicates)
		for(Integer i:hs) {
			System.out.println(i);
		}

	}

}
