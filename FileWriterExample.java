package Pratice2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            String fileName = "codestates2.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "Fuck Code";
            String str2 = "Fucking JAVA!";
            writer.write(str);
            writer.write(str2);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
