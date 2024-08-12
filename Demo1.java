class Human {
    private int age;
    private String name;

    public Human() { // default constructer
        age = 22;
        name = "Anish";
    }

    public Human(int age, String name) { // parameterized constructer
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human(12, "Hello");

        h.setAge(22);
        h.setName("Dahal");

        System.out.println(h.getName() + " : " + h.getAge());
        System.out.println(h1.getName() + " : " + h1.getAge());

    }
}
