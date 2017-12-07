package org.abstraction;

public abstract class Shape {
	public abstract double area();
	public abstract double getRadius();
	public abstract void setRadius(double radius);
	
	private String colour;
	private boolean filled;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
}
