package com.wbqa.collection;

import java.util.EnumMap;
import java.util.EnumSet;

/* Printing the values of Enumeration*/

public class PrintEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Months m : Months.values()) {
			System.out.println(m.name());
		}

	}

}
