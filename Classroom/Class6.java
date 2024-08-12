package Classroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Class6 {
    public static void main(String[] args) {
        try {
            FileWriter in = new FileWriter("emp.txt");
            BufferedWriter bw = new BufferedWriter(in);

            bw.write("Hari, 1, Nepali");
            bw.close();

        } catch (IOException e) {
            System.out.println("Can't be resolved");
        }
    }
}
