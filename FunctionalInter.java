@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class FunctionalInter {
    public static void main(String[] args) {
        A a = (i, j) -> {
            return i + j;
        };
        int x = a.add(5, 6);
        System.out.println("Sum= " + x);
    }
}
