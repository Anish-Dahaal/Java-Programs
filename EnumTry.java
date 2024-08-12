enum Laptop {
    Macbbok(2000), HP(1800), Surface, Dell(1432);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumTry {
    public static void main(String[] args) {
        // Laptop lap = Laptop.HP;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());

        }
    }
}

// Using enum for constants but it actually creates a class which can be used by
// creating object.
// enum Status {
// Running, Failed, Pending, Success;
// }

// public class EnumTry {

// public static void main(String[] args) {
// Status s = Status.Failed;

// switch (s) {
// case Running:
// System.out.println("All good");
// break;
// case Failed:
// System.out.println("Try again");
// break;
// case Pending:
// System.out.println("Please Wait");
// break;

// default:
// System.out.println("Done.");
// break;
// }
// }
// }

// Status[] s = Status.values();
// for (Status sa : s) {
// System.out.println(sa + " : " + sa.ordinal() );
// }