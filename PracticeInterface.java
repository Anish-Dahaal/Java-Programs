//  Tring extending inheritance and calling methods.
//class to class ->extends
//class to interface ->implements
//inteface to interface -> extends
interface A {

    int b = 8; // Static and Final
    String str = "Pokhara";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.out.println("In show method..");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("Running done.");
    }

}

public class PracticeInterface {
    public static void main(String[] args) {
        A a = new B();
        X b = new B();
        a.config();
        a.show();
        b.run();
        System.out.println(A.b);

    }

}

// Interface for creating instances for two classes in third class and calling
// the required method of class by creating
// an object and calling the object of necesssary class.
// interface Computer {
// abstract public void code();
// }

// class Laptop implements Computer {
// public void code() {
// System.out.println("code, Run, Compile");
// }
// }

// class Desktop implements Computer {
// public void code() {
// System.out.println("Code, Run,fast");
// }
// }

// class Developer {
// public void devApp(Computer lap) {
// lap.code();
// }
// }

// public class PracticeInterface {
// public static void main(String[] args) {
// Computer lap = new Laptop();
// Computer desk = new Desktop();

// Developer Anish = new Developer();
// Anish.devApp(lap);
// }
// }

//
//
// interface Hellos {
// abstract float area();

// abstract void draw();

// }

// class Art implements Hellos {

// String color;
// float length, breadth;

// public Art(float length, float breadth, String color) {
// this.length = length;
// this.breadth = breadth;
// this.color = color;
// }

// public float area() {
// return length * breadth;
// }

// public void draw() {
// System.out.println("Drawing");
// }

// String getColor() {
// return "hi";
// }

// }

// public class PracticeInterface {
// public static void main(String[] args) {
// Hellos h = new Art(23, 56, "bhj");
// System.out.println("area:" + h.area());
// h.draw();

// }
// }
