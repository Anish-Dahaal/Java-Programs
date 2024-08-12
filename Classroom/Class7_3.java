package Classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class7_3 {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader br = new BufferedReader(new FileReader("emps.txt"));
        do {
            String emp = br.readLine();
            String w[] = emp.split(", ");
            int a = Integer.parseInt(w[2]);
            if (a >= 20000) {
                System.out.println();
            }
        } while (true);
    }
}
