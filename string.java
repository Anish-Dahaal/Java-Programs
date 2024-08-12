class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static");
    }

    public Mobile() {
        brand = "";
        price = 10202;
        System.out.println("in constructor");

    }

    public Mobile(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }
}

public class string {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 200000;
        Mobile.name = "15 pro max";

        Mobile obj2 = new Mobile(2121);
        obj2.brand = "Samsung";
    }
}
