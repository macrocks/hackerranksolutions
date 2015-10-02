package org.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * Create By: Amit G Date: 2/10/2015 
 *  This example shows use of forEach method introduced in Java8 for iteration purpose
 * 
 */
public class ForEach {

	public static void main(String[] args) {

		// this is a list which hold Integer objects in it
		List<Integer> intergerList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			intergerList.add(i);

		// to print this we below options use Iterator, for loop or while loop
		Iterator<Integer> iterator = intergerList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// in case of Iterator you might face problem with
		// ConcurrentModificationException if it is not used properly.

		// for loop example to print list
		for (Integer intValue : intergerList) {
			System.out.println(intValue);
		}

		// java 8 feature of consumer to iterate over a list
		System.out.println("this is java 8 feature value");
		intergerList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});   // still in this case iterating logic and business logic is attached

		// also we can create custom class and override accept method to have
		// new logic in it
		Myconsumer myconsumer = new Myconsumer();
		intergerList.forEach(myconsumer);
		//in This case you are separating your business logic from iterating logic
	}
}

class Myconsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Custom Class value" + t);

	}

}
