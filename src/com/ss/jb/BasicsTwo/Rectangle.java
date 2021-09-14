/**
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Rectangle implements Shape 
{
	Float length;
	Float width;
	
	public Rectangle() {
		length = 0.0f;
		width  = 0.0f;
	}

	public Rectangle(float lengthIn, float widthIn) {
		length = lengthIn;
		width  = widthIn;
	}

	@Override
	public Float calculateArea() {
		return (length * width);
	}
	
	@Override
	public void display()
	{
		System.out.println("Length: " + String.format("%.3f", length));
		System.out.println("Width: "  + String.format("%.3f", width));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
