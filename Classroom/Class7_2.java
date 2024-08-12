package Classroom;

// WAP in Java that reads details of employee(id, name, salary, city) from keyboard and writes to 
// a file "emps.txt" until user says "No".

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class7_2 {
    public static void main(String[] args) throws IOException {
        String name, city, choice;
        int id;
        double salary;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("emps.txt"));
        do {
            System.out.println("Enter Name");
            name = br.readLine();
            System.out.println("Enter Id");
            id = Integer.parseInt(br.readLine());
            System.out.println("Enter Salary:");
            salary = Double.parseDouble(br.readLine());
            System.out.println("Enter City");
            city = br.readLine();

            String emp = name + ", " + id + ", " + salary + ", " + city;

            bw.write(emp);
            bw.newLine();

            System.out.println("Do you want to continue? ");
            choice = br.readLine();

            if (choice == "Yes") {
                continue;

            } else {
                break;
            }

        } while (true);
        bw.close();
        br.close();
    }
}
