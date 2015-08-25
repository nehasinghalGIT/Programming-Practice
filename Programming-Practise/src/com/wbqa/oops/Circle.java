package com.wbqa.oops;

/*c. Write a program that creates a class Circle extending Shape abstract class and 
 * implementing ShapeConstants interface and has following behavior.
 --> Properties: radius.
 --> Constructor: To set number of sides.
 --> Overrides all the methods from parents.
 */

public class Circle extends Shape implements ShapeConstants {

	double radius;

	public Circle(int sides, double rad) {
		setSides(sides);
		radius = rad;
	}

	public double calculateArea() {

		double area = pi * radius * radius;
		return area;

	}

	public double calculatePerimeter() {
		double perimeter = 2 * pi * radius;
		return perimeter;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(0, 1.2);
		double a = c.calculateArea();
		System.out.println("Area is =" + a);
		double p = c.calculatePerimeter();
		System.out.println("Perimeter is =" + p);

	}

}
