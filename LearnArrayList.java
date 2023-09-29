import java.util.ArrayList;

class Student {
    public int roll;
    public String name;
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static int count = 0;

    public Student(String _name) {
        this.name = _name;
        this.roll = Student.count;
        Student.count++;
        Student.students.add(this);
    }

}

public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> fibs = new ArrayList<Integer>();
        // fibs.add(0);
        // fibs.add(1);
        // for (int n = 2; n < 5; n++) {
        // int sum = fibs.get(n - 1) + fibs.get(n - 2);
        // fibs.add(sum);
        // }
        // for (int i = 0; i < fibs.size(); i++) {
        // System.out.println(fibs.get(i));
        // }
        new Student("kuddus");
        new Student("Jorina");
        for (int i = 0; i < Student.students.size(); i++) {
            System.out.println(Student.students.get(i).name);
        }
    }

    public static void showStudents() {

    }

}