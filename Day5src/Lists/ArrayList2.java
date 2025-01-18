package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List <Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(48);
		l2.add(89);
		l2.add(15);
		l2.add(2908);
		l2.remove(1); //can remove number by giving the index 
		System.out.println(l2.contains(89));
		List <Integer> l3=new ArrayList<Integer>();
		l3.add(100);
		l3.add(200);
		l3.add(400);
		List <Integer> l4=new ArrayList<Integer>(l2);
		l4.addAll(l3);
		for(int i:l4) {
			System.out.println(i);
		}
	}

}
