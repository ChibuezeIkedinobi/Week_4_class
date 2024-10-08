package org.week4.classActivity1A;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer wr = new FileWriter(desktopPath + "/output.csv");
            String fileContent = "I am learning how to write to a csv file";

            wr.write(fileContent);
            wr.close();

            System.out.println("Successfully wrote into a csv file");
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
