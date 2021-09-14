/**
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Circle implements Shape
{
	Float radius;
	
	public Circle() {
		radius = 0.0f;
	}

	public Circle(float radiusIn) {
		radius = radiusIn;
	}

	@Override
	public Float calculateArea() {
		return (((float)Math.PI) * (radius * radius));
	}
	
	@Override
	public void display()
	{
		System.out.println("Radius: " + String.format("%.3f", radius));
		System.out.println("Area: "   + String.format("%.3f", calculateArea()));
	}
}
