package Classroom;

interface Hi {
    void show();
}

class Hell implements Hi {
    public void show() {
        System.out.println("In hell");
    }
}

public class A {
    public static void main(String[] args) {
        Hi h = new Hell();
        h.show();

    }

}
