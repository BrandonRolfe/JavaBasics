/**
 * Holds a circle
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Circle implements Shape
{
	Float radius; // Radius of a rectangle
	
	// Default constructor
	public Circle() {
		radius = 0.0f;
	}

	// Float constructor
	public Circle(float radiusIn) {
		radius = radiusIn;
	}

	// Calculates the area of the circle
	@Override
	public Float calculateArea() {
		return (((float)Math.PI) * (radius * radius));
	}
	
	// Displays the specifications of the circle
	@Override
	public void display()
	{
		System.out.println("Radius: " + String.format("%.3f", radius));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
