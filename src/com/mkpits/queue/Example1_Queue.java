package com.mkpits.queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Example1_Queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(13);
		queue.add(14);
		queue.add(11);
		queue.add(1);
		System.out.println("Elements of Queue is "+queue);

	}

}
