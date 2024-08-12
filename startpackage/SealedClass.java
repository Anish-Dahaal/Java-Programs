package startpackage;

// Limited class to be inherited -> Sealed class
interface Sos {

}

sealed class A extends Thread implements Sos permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}

class D extends B {

}

record Hello(int id, String name) {
} // private and final identifiers

public class SealedClass {
    public static void main(String[] args) {

    }
}
