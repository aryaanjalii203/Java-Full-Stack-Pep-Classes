package Lists;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anjali");
		l1.add("Issar");
		l1.add("Radhika");
		l1.add("Shabnam");
		ListIterator<String> litr=l1.listIterator();//it can move forward and backward
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	System.out.println("----------Ha Ha Ha--------------");
	
	while(litr.hasPrevious()) {
		System.out.println(litr.previous());
	}

}
}
