package Classroom;

interface Printable {
    void print();
}

abstract class Account implements Printable {
    private int id;
    private String name;
    private Double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public void print() {
        System.out.println(id + " : " + " : " + name + " : " + " : " + balance);
    }

}

class SavingAccount extends Account {
    private double minBalance;

    public SavingAccount(double minBalance, int id, String name, double balance) {
        super(id, name, balance);
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void print() {
        super.print();
        System.out.println(minBalance);
    }

}

class MyDate implements Printable {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void print() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class FixedAccountDate implements Printable {
    private MyDate expiryDate;

    public FixedAccountDate(MyDate exp) {
        this.expiryDate = exp;
    }

    public MyDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(MyDate exp) {
        this.expiryDate = exp;
    }

    public void print() {
        System.out.println(expiryDate);
    }

}

public class Class5 {
    public static void main(String[] args) {

        Printable p3 = new SavingAccount(23233, 1, "Abc", 32323);
        p3.print();

    }
}
