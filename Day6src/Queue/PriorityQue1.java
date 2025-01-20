package Queue;

import java.util.PriorityQueue;

public class PriorityQue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();//Priority queue will provide you the sorted array
		pq.add(10);
		pq.add(1);
		pq.add(56);
		pq.add(9);
		pq.add(49);
		pq.add(99);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());//it will remove the head element even we wouldn't say it in the output
		
		for(Integer i:pq) {
			System.out.println(i);
		}
		
	}

}
