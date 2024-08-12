package Classroom;

class Employee {
    static int count = 0;
    int id;
    String name;
    float Salary;
    static String company;

    public Employee(int id, String name, float Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;

        count++;
    }

    static {
        company = "Abc";
    }

    public static void displaycount() {
        System.out.println(count + " Added");
    }
}

public class Class1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Anish", 238938);
        Employee e2 = new Employee(2, "Hello", 374893);
        Employee.displaycount();
        System.out.println(e1.Salary);
        System.out.println(e2.name);

    }
}
