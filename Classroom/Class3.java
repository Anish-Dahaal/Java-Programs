package Classroom;

class Calculator {
    int x, y;

    // public Calculator(int x, int y) {
    // this.x = x;
    // this.y = y;
    // }

    public int add(int x, int y) {
        return x + y;
        // System.out.println("The sum is " + a);
    }

    public int sub(int x, int y) {
        return x - y;
        // System.out.println("The diff is " + b);
    }
}

class Advance extends Calculator {
    int c, d;

    public Advance(int c, int d) {
        this.c = c;
        this.d = d;

    }

    public void Mul() {
        int z = c * d;
        System.out.println("Multiply: " + z);
    }

    public void Div() {
        int f = c / d;
        System.out.println("Division: " + f);
    }
}

public class Class3 {
    public static void main(String[] args) {

        Advance calc = new Advance(4, 5);
        int a = calc.add(4, 5);
        int b = calc.sub(4, 3);
        System.out.println("Sum: " + a);
        System.out.println("Difference: " + b);
        calc.Mul();
        calc.Div();

    }
}
