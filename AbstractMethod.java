abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void music() {
        System.out.println("Playing music");
    }
}

abstract class Ford extends Car {
    public void drive() {
        System.out.println("Drives");
    }
}

class UpdatedFord extends Ford { // Concrete Class

    public void fly() {
        System.out.println("Flying");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Car obj = new UpdatedFord();
        obj.drive();
        obj.music();
        obj.fly();
    }
}
