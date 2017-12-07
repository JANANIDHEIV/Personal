package org.abstraction;

public class AbstrationMain {

	public static void main(String[] args) {
		Shape obj = new Circle();
		obj.setRadius(13.879);
		System.out.println("Radius is : "+ obj.getRadius());
		System.out.println("Area : "+ obj.area());

	}

}
