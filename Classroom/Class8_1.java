//Remove

package Classroom;

import java.io.*;

public class Class8_1 {

    public static void main(String args[]) throws IOException {
        File original = new File("emp.txt");
        File temp = new File("temp.txt");
        FileReader fr = new FileReader(original);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        String emp;
        while ((emp = br.readLine()) != null) {
            String[] list = emp.split(",");
            if (!(list[3].equals("ktm"))) {
                bw.write(emp);
                bw.newLine();
            }
        }
        br.close();
        bw.close();
        fr.close();
        original.delete();
        File dump = new File("emp.txt");
        temp.renameTo(dump);
    }

}
