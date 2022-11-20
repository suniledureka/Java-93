package co.edureka.util;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=10; i>0; i--) {
			q.add(i);
		}
		
		System.out.println(q);
		System.out.println("----> " + q.poll());
		
		System.out.println(q);
		System.out.println("----> " + q.poll());
		
		System.out.println(q);
		System.out.println("----> " + q.poll());
		
		System.out.println(q);
		System.out.println("----> " + q.poll());
		
		System.out.println(q);
	}

}
