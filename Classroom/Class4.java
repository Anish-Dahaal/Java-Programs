package Classroom;

class Department {
    String HOD;
    int totalEmp;

    Department(String HOD, int totalEmp) {
        this.HOD = HOD;
        this.totalEmp = totalEmp;
    }

}

class CSDepartment extends Department {
    CSDepartment(String HOD, int totalEmp) {
        super(HOD, totalEmp);
    }

    public void display() {
        System.out.println("HOD: " + HOD + "  Total Emp: " + totalEmp);
    }

}

class CZDepartment extends Department {
    CZDepartment(String HOD, int totalEmp) {
        super(HOD, totalEmp);
    }

    public void display() {
        System.out.println("HOD: " + HOD + "  Total Emp: " + totalEmp);
    }

}

public class Class4 {
    public static void main(String[] args) {
        CSDepartment c1 = new CSDepartment("Man", 4);
        CZDepartment c2 = new CZDepartment("Hi", 43);
        c2.display();
        c1.display();

    }
}