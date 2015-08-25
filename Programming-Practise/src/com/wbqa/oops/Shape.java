package com.wbqa.oops;

/*  a. Write a program creating an abstract class Shape with properties 
 * (noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.
 * 
 */

public abstract class Shape {

	private int noOfSides;
	private double area;
	private double perimeter;

	public void setSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

}
