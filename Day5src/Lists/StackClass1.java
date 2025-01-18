package Lists;

import java.util.ListIterator;
import java.util.Stack;

public class StackClass1 {

	public static void main(String[] args) {
		Stack s=new Stack<Integer>();//it's extends vector class so we have vector methods also
		s.push(20);
		s.add(10);
		s.push(52);
		s.push(15);
		s.add(99);
		s.push(62);
		s.push(29);
		s.add(13);
		s.push(82);
		//s.clear it will make empty your stack and then it will give error for pop
		System.out.println(s.pop());//removes the last element
		
		ListIterator<Integer> st=s.listIterator();
		System.out.println("---------------------------");
		while(st.hasNext()) {
			System.out.println(st.next());
		}

	}

}
