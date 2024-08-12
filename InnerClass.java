// Anonumous class

class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A() {
            public void show() {
                System.out.println("In new Show");
            }
        };
        a.show();
    }

}

// static inner class

// class A {
// int age;

// public void show() {
// System.out.println("in show");
// }

// static class B {
// public void config() {
// System.out.println("In config");
// }
// }

// }

// public class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();

// A.B b = new A.B();
// b.config();
// }

// }

// non-static inner class

// class A {
// int age;

// public void show() {
// System.out.println("in show");
// }

// class B {
// public void config() {
// System.out.println("In config");
// }
// }
// }

// public class InnerClass {
// public static void main(String[] args) {
// A a = new A();
// a.show();

// A.B b = a.new B();
// b.config();
// }

// }
