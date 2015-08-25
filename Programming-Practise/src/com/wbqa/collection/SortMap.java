package com.wbqa.collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*  		e. Write a program to sort a map by value.*/

public class SortMap {

	Map<String, Integer> unsortedMap = new HashMap<String, Integer>();

	public void createMap() {
		unsortedMap.put("one", 1);
		unsortedMap.put("ten", 10);
		unsortedMap.put("three", 3);

		System.out.println("********Unsorted Map************");
		printMap(unsortedMap);

		Map<String, Integer> sortedMap = sortByValue(unsortedMap);
		System.out.println("********Sorted Map***************");
		printMap(sortedMap);
	}

	public Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(
				unsortedMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return ((o1.getValue()).compareTo(o2.getValue()));
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		Iterator<Map.Entry<String, Integer>> it = list.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	public void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[Key]" + entry.getKey() + "[Value]"
					+ entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortMap sm = new SortMap();
		sm.createMap();

	}

}
