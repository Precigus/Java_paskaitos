package days.third;

import java.io.*;

public class ReadFileExample {

    public static void main(String... args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("testData.txt")));
            String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
