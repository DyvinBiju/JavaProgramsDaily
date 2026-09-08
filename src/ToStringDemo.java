class StudentWithoutToString {
    String name;
    int rollNo;

    StudentWithoutToString(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        StudentWithoutToString s1 = new StudentWithoutToString("Anita", 101);
        System.out.println("Without toString(): " + s1);
        // Output: Without toString(): StudentWithoutToString@<hashcode>

        Student s2 = new Student("Ravi", 102);
        System.out.println("With toString(): " + s2);
        // Output: With toString(): Student{name='Ravi', rollNo=102}
    }
}
