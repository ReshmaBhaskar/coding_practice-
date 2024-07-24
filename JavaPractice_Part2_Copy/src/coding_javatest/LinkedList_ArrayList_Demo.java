package coding_javatest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ArrayList_Demo {

	public static void main(String[] args) {
		//comparison of time taken to do operations like add/ remove items in arraylist or linkedlist

		//time taken to add first element to array list
		List<Integer> array = new ArrayList<>();
		
		long now = System.currentTimeMillis();
		
		for(int i=0;i<500000;++i)
			array.add(0,i);
		System.out.println(array.size());
		System.out.println("Time taken for arraylist to add all items is -" +(System.currentTimeMillis()-now));
		//System.out.println(array.toString());
		
		
		
		//time taken to add first element to doubly linked list
		LinkedList<Integer> llist = new LinkedList<>();
		
		 now = System.currentTimeMillis();
		
		for(int i=0;i<500000;++i)
			//llist.add(i);
		llist.addFirst(i);
		System.out.println(llist.size());
		System.out.println("Time taken for LinkedList to add all items is -" +(System.currentTimeMillis()-now));
		//System.out.println(llist.toString());
		
	}

}
