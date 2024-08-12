class Student {
    int rollno;
    String name;
    int marks;

}

public class secondemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Anish";
        s1.marks = 70;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Hell";
        s2.marks = 50;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "HI";
        s3.marks = 30;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.rollno + ". " + s.name + " : " + s.marks);
        }

        // int nums[] = new int[4];
        // nums[0] = 3;
        // nums[1] = 4;
        // nums[2] = 6;
        // nums[3] = 1;

        // for (int i : nums) {
        // System.out.println(i);
        // }
    }
}
