package com.wbqa.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*d. Write a program having below methods.
 --> To create a hashmap.
 --> To search for a key in the created map and then returns its value.

 */

public class CreateHashMap {

	HashMap<String, String> hashMap = new HashMap<String, String>();
	String value;

	public void addElements() {
		hashMap.put("Shelly", "Smith");
		hashMap.put("Lucy", "wick");
		hashMap.put("Terry", "Saad");
	}

	public String searchKey(String key) {
		Set<String> set = hashMap.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			value = hashMap.get(key);
			break;
		}
		return value;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		CreateHashMap hm = new CreateHashMap();
		hm.addElements();
		String searchValue = hm.searchKey("Shelly");
		System.out.println("The value corresponding to entered key is" + " "
				+ searchValue);

	}

}
