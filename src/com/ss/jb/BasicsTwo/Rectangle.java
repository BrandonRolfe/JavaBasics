/**
 * Holds a rectangle
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Rectangle implements Shape 
{
	Float length; // Length of a rectangle
	Float width;  // Width  of a rectangle
	
	// Default constructor
	public Rectangle() {
		length = 0.0f;
		width  = 0.0f;
	}

	// Float constructor
	public Rectangle(float lengthIn, float widthIn) {
		length = lengthIn;
		width  = widthIn;
	}

	// Calculates the area of the rectangle
	@Override
	public Float calculateArea() {
		return (length * width);
	}
	
	// Displays the specifications of the rectangle
	@Override
	public void display()
	{
		System.out.println("Length: " + String.format("%.3f", length));
		System.out.println("Width: "  + String.format("%.3f", width));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
