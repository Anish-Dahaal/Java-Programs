class Abcd {
    public void show() {

    }
}

class Bcde extends Abcd {
    public void show1() {

    }
}

public class TypeCast {
    public static void main(String[] args) {
        Abcd obj = new Bcde();
        obj.show();

        Bcde obj1 = (Bcde) obj;
        obj1.show1();

    }
}