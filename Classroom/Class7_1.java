package Classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class7_1 {
    public static void main(String[] args) throws IOException {
        String s;
        int sum = 0;
        int count = 0;

        FileReader in = new FileReader("z.txt");
        BufferedReader br = new BufferedReader(in);
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s.trim());
            sum = sum + n;
            count++;

        }
        System.out.println("Sum=" + sum);
        System.out.println("Average" + ((double) sum / count));
        br.close();
    }
}
