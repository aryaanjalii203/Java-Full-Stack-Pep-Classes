package Queue;

import java.util.ArrayDeque;

public class DequeEx1 {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(46);
		dq.add(13);
		dq.offerFirst(4);
		dq.offerLast(99);
		dq.add(56);
		dq.add(14);
		dq.add(78);
		System.out.println(dq.peek());
		System.out.println(dq.remove());
		for(Integer i:dq) {
			System.out.println(i);
		}
		
	}

}
