class A {
    public void show() {
        System.out.println("A Showing");
    }

    public void conif() {
        System.out.println("In a Config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B a = new B();
        a.show();
        a.conif();
    }
}
