// Abstract class method

package Classroom;

//interface Shape {
abstract class Shape {
    float length, breadth;
    String color;

    abstract void draw();

    abstract float area();

    String getColor() { // abstract String getColor();
        return color;
    }

}

class Rectangle extends Shape { // class Rectange implements Shape and

    public Rectangle(float length, float breadth, String color) {
        this.length = length;
        this.breadth = breadth;
        this.color = color;
    }

    void draw() {
        System.out.println("Drawing logic of rectangle");
    }

    float area() {
        return length * breadth;
    }
}

public class Class2 {
    public static void main(String[] args) {
        Shape r = new Rectangle(3f, 5f, "purple");
        r.draw();
        System.out.println("Area=" + r.area());
        System.out.println("Color=" + r.getColor());
    }
}
