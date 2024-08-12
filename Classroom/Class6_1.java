package Classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class6_1 {
    public static void main(String[] args) {
        try {
            String s;
            FileReader out = new FileReader("emp.txt");
            BufferedReader br = new BufferedReader(out);
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                br.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
