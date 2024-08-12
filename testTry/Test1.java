package testTry;

public class Test1 {
    public static void main(String[] args) {
        Calc c = new Calc();
        int res1 = c.divide(22, 2);
        if (res1 == 11)
            System.out.println("Test case passed");
        else
            System.out.println("test case failed");

        int res2 = c.multiply(32, 3);
        System.out.println(res2);
    }
}
