/**
 * Test program for the Rectangle, Circle, and Triangle classes
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Basics2A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiates one of each
		Rectangle rectangle1 = new Rectangle(15.0f, 20.0f);
		Circle circle1       = new Circle(9.0f);
		Triangle triangle1   = new Triangle(4.0f, 7.0f);
		
		// Displays each
		rectangle1.display();
		circle1.display();
		triangle1.display();
	}
}
