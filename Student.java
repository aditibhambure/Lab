package lab_ex;

public class Student {
    private String name;
    private String address;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}

public class Student_demo {
	public static void main(String[] args) {
        Student student1 = new Student("Aditi","Solapur,India",24);
        Student student2 = new Student("Steve", "Hawkins, Indiana",27);
        Student student3 = new Student("Stark", "New York, USA", 28);

        System.out.println("Student 1: " + student1.getName() + ", " + student1.getAddress() + ", " + student1.getAge());
        System.out.println("Student 2: " + student2.getName() + ", " + student2.getAddress() + ", " + student2.getAge());
        System.out.println("Student 3: " + student3.getName() + ", " + student3.getAddress() + ", " + student3.getAge());
    }


}