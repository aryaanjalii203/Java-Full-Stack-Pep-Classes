package Queue;


import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(460);
		ts.add(9);
		ts.add(29);
		ts.add(8);
		ts.add(46);
		ts.add(29);//it wouldn't override the same element(no duplicates)
		for(Integer i:ts) {
			System.out.println(i);//elements are sorted 
		}

	}

}
