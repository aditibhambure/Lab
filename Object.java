public class Object {
	private String name;

    public Object(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, This is " + name + "!");
    }
}

public class Object_demo {
	 public static void main(String[] args) {
	        Object person = new Object("a Chair");
	        person.sayHello();
	    }
}