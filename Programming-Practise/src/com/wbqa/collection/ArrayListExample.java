package com.wbqa.collection;

import java.util.List;
import java.util.*;

/*a. Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.
*/


public class ArrayListExample {

	List<Integer> list = new ArrayList<Integer>();

	public void addElements() {
		list.add(10);
		list.add(20);
		list.add(30);
	}

	public void searchElement(int number) {
		boolean flag = false;
		for (int i : list) {
			if (i == number) {
				flag = true;
				break;
			}
			if (flag = true)
				System.out.println("Number is present");
		}
	}

	public void printElements() {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int number = it.next();
			System.out.println("Number is" + number);
		}

	}

	public void printReverseOrder() {
		ListIterator<Integer> li=list.listIterator();
		while(li.hasPrevious())
		{
			int number=li.previous();
			System.out.println("Number is" + number);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample a = new ArrayListExample();
		a.addElements();
		a.searchElement(20);
		a.printElements();
		a.printReverseOrder();

	}

}
