package org.abstraction;

public class Circle extends Shape {
	private double radius;
	private static final double PI=3.14;
	@Override
	public double area() {
		return Circle.PI * this.radius * this.radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
