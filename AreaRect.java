package Lab_work;

abstract class Shape {
	  abstract int calculateArea();
	}

	class Circle extends Shape {
	  int radius;
	  Circle(int radius) {
	    this.radius = radius;
	  }
	  int calculateArea() {
	    return 22/7 * radius * radius;
	  }
	}

	class Rectangle extends Shape {
	  int length, width;
	  Rectangle(int length, int width) {
	    this.length = length;
	    this.width = width;
	  }
	  int calculateArea() {
	    return length * width;
	  }
	}

	public class AreaRect {
	  public static void main(String[] args) {
	    Circle circle = new Circle(6);
	    System.out.println("Area of circle: " + circle.calculateArea());

	    Rectangle rectangle = new Rectangle(5, 9);
	    System.out.println("Area of rectangle: " + rectangle.calculateArea());
	  }
	}