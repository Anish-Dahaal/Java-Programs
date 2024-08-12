// Replace

package Classroom;

import java.io.*;

public class Class8_2 {
    public static void main(String args[]) throws IOException {
        File original = new File("emp.txt");
        File temp = new File("temp.txt");
        FileReader fr = new FileReader(original);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        String emp, list[], str;
        while ((emp = br.readLine()) != null) {
            list = emp.split(",");
            if (!(list[3].equalsIgnoreCase("pokhara"))) {
                bw.write(emp);
                bw.newLine();
                continue;
            }

            list[3] = "jhapa";
            str = list[0] + "," + list[1] + "," + list[2] + "," + list[3];
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();
        fr.close();
        original.delete();
        File dump = new File("emp.txt");
        temp.renameTo(dump);
    }
}
