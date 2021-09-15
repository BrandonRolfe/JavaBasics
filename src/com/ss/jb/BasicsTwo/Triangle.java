/**
 * Holds a triangle
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Triangle implements Shape {
	Float base;   // Base length of a triangle
	Float height; // Height of a triangle
	
	// Default constructor
	public Triangle() {
		base = 0.0f;
		height  = 0.0f;
	}

	// Float constructor
	public Triangle(float baseIn, float heightIn) {
		base = baseIn;
		height  = heightIn;
	}

	// Calculates the area of the triangle
	@Override
	public Float calculateArea() {
		return ((0.5f * base) * height);
	}
	
	// Displays the specifications of the triangle
	@Override
	public void display()
	{
		System.out.println("Base: " + String.format("%.3f", base));
		System.out.println("Height: "  + String.format("%.3f", height));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
