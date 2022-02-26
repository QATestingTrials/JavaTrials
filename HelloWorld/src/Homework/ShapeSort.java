package Homework;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeSort {

	public static void main(String[] args) {

		    Shape square = new Shape("Square", 5); // Area 25
			Shape rectangle = new Shape("Rectangle", 6, 7); //Area 42
			Shape circle = new Shape("Circle", 8); // Area 200.96
			
			Shape[] shapes = {square, rectangle, circle};
			System.out.println("Before sorting:"+Arrays.toString(shapes));
			Arrays.sort(shapes);
			System.out.println("After sorting area in Ascending order :"+Arrays.toString(shapes));
			Arrays.sort(shapes, Comparator.reverseOrder());
			System.out.println("After sorting area in Descending order :"+Arrays.toString(shapes));
			double largest = 0;
			Shape tempArea = null;
			
			
			for(int i=0; i<shapes.length; i++) {
				Shape s = shapes[i];
				
				if(largest < s.getArea()) {
					largest = s.getArea();
					tempArea = s;
				}
				
				System.out.println("Shape:" + s.getName());
				System.out.println("Area:" + s.getArea());
				
			}
			
			
			System.out.println("Name of the shape with Largest area is :" + tempArea.getName());
			
		}

	}


	class Shape implements Comparable<Shape>{
		
		private String name;
		private int length;
		private int width;
		private int radius;
		private double area;
		
		private final double PI = 3.14;

		public Shape() {
		}

		public Shape(String name, int length, int width, int radius) {
			this.name = name;
			this.length = length;
			setArea();
		}
		
		public Shape(String name, int length, int width) {
			this.name = name;
			this.length = length;
			this.width = width;
			setArea();
		}
		
		public Shape(String name, int radius) {
			this.name = name;
			this.radius = radius;
			setArea();
		}
		
		
		private void setArea() {
			if(name.equals("Square")) {
				this.area = length * length;
			} else if(name.equals("Rectangle")) {
				this.area = length * width;
			} else if(name.equals("Circle")) {
				this.area = PI * radius * radius;
			} else {
				this.area = 0;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public int getWidth() {
			return width;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		public int getRadius() {
			return radius;
		}

		public double getArea() {
			return area;
		}

		@Override
		public String toString() {
			return "Shape [name=" + name + ", length=" + length + ", width=" + width + ", radius=" + radius + ", area="
					+ area + "]";
		}

		@Override
		public int compareTo(Shape o) {
			
			return (int) (this.area - o.area);
		}
		}