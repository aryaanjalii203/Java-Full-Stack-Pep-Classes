package Lists;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(12);
		v.addElement(122);
		v.add(82);
		v.addElement(85);
		Enumeration<Integer> en=v.elements();//as it is a legacy class 
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
