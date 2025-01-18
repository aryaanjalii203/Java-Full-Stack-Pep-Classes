package Lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anjali");
		l1.add("Issar");
		l1.add("Radhika");
		l1.add("Shabnam");
		Iterator<String> itr=l1.iterator();//Iterator is a interface and this is factory method, 
		//it has only forward methods
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}

	}

}
