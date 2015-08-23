package com.wbqa.pp;

/* Immutable classes are those which are defined by FINAL keyword and cannot be extended 
 * Also, the data members of the class are also final
 *   		a. Write an Immutable class.
 */

public final class Employee {

	final String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

}
