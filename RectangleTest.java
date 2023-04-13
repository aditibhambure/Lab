package lab_ex;

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