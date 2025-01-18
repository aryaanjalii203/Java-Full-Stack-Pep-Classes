package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String args[]) {
		List l1=new ArrayList();//non generic declaration(not specified the type so it can hold any type of element)
		List <Integer> l2=new ArrayList<Integer>();//generic declaration
		l1.add(12);
		l1.add(4.5);
		l1.add(49);
		l1.add(null);
		l1.add(null);//you can add null multiple times as it allows duplicates
		l1.add("Anjali Arya");
		for(Object i:l1) { //use Object for hetergeneous 
			System.out.println(i);
		}
		System.out.println("---------------------------");
		l2.add(15);
		l2.add(78);
		l2.add(89);
		for(int i:l2) { //use Object for homogeneous 
			System.out.println(i);
		}
	}
}
