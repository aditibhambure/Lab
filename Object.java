package lab_ex;

public class Object {
	private String name;

    public Object(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, This is " + name + "!");
    }
}

