package test2;

public class Student {

    int id;
    String name;
    int marks;
    String address;

    Student(int id, String name, int marks, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    private void show() {
        if (marks >= 70) {
            System.out.println("id=>" + id + "name=>" + name + "marks=>" + marks + "address=>" + address);
        }
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "mohan", 78, "sangli");
        Student obj2 = new Student(2, "daud", 68, "sangli");
        obj1.show();
        obj2.show();

    }
}
