package startpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Sorting {
    public static void main(String[] args) {
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        // if (i.age > j.age)
        // return 1;
        // else
        // return -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "Anish"));
        studs.add(new Student(20, "Prabhat"));
        studs.add(new Student(21, "Tika"));
        studs.add(new Student(12, "Someone"));

        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
