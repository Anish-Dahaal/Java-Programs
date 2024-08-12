// Camel casing

// class- capital letter in first
// variable and method- small letters
// constants- ALL CAPITAL_PI

// showMyMarks();

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class AdvCalc extends Calculator {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public double div(int n1, int n2) {
        return (n1 / n2);
    }
}

class Scientific extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class DoubleInheritence {
    public static void main(String[] args) {
        Scientific c = new Scientific();
        int a = c.add(4, 6);
        int z = c.sub(6, 3);
        int y = c.multi(3, 5);
        double x = (double) (c.div(43, 2));
        double w = c.power(2, 3);
        System.out.println(a + "  " + z + "  " + y + "  " + x + " " + w);

    }
}
