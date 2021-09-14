/**
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Triangle implements Shape {
	Float base;
	Float height;
	
	public Triangle() {
		base = 0.0f;
		height  = 0.0f;
	}

	public Triangle(float baseIn, float heightIn) {
		base = baseIn;
		height  = heightIn;
	}

	@Override
	public Float calculateArea() {
		return ((0.5f * base) * height);
	}
	
	@Override
	public void display()
	{
		System.out.println("Base: " + String.format("%.3f", base));
		System.out.println("Height: "  + String.format("%.3f", height));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
