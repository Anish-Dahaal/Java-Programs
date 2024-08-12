// WAP in java that writes 1000 randomly genatates numbers to file named "z.txt".

package Classroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Class6_2 {
    public static void main(String[] args) {
        try {
            FileWriter in = new FileWriter("z.txt");
            BufferedWriter bw = new BufferedWriter(in);
            Random rand = new Random();

            for (int i = 0; i < 1000; i++) {
                int a = rand.nextInt(1000);
                bw.write(a + " ");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("We got error" + e);
        }
    }
}