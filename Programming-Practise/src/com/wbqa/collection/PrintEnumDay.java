package com.wbqa.collection;

public class PrintEnumDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Day d : Day.values()) {
			System.out.println(d.name());
		}
	}

}
