class AnishException extends Exception {
    public AnishException(String str) {
        super(str);
    }
}

class A {
    public void show() throws ClassNotFoundException {

        Class.forName("Hi");

    }
}

public class ExcepHandle {
    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}

// class AnishException extends Exception {
// public AnishException(String str) {
// super(str);
// }
// }

// public class ExcepHandle {
// public static void main(String[] args) {
// int a = 21;
// int b = 0;

// try {
// b = 18 / a;

// if (b == 0) {
// throw new AnishException("I don't want to print zero");
// }

// } catch (AnishException e) {
// b = a / 1;
// System.out.println("Using default output. " + e);
// }

// catch (Exception e) {

// System.out.println("Error or exception occured " + e);
// }

// System.out.println(b);
// System.out.println("Bye");
// }
// }
