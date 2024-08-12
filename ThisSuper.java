class A {
    public A() {
        super(); // super is always there if a constructer is created.
        System.out.println("Hi");
    }

    public A(int s) {
        System.out.println("It uses int of A");
    }
}

class B extends A {
    public B() {
        System.out.println("Abcdxs");
    }

    public B(int a) {
        this();
        System.out.println("This uses a value");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B b = new B(5);
        System.out.println(b.equals(b));
    }
}
