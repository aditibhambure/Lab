package lab_ex;

public class Rectangle {
	private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class RectangleTest {
	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 40);
        int area = rectangle.getArea();
        System.out.println("Area : " + area);

        rectangle.setLength(30);
        rectangle.setBreadth(30);
        int newArea = rectangle.getArea();
        System.out.println("New area : " + newArea);
    }
}