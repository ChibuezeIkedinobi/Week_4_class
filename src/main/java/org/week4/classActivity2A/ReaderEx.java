package org.week4.classActivity2A;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Reader r = new FileReader(desktopPath + "/output.csv");

            int readContent = r.read();

            while (readContent != -1) {
                System.out.print((char) readContent);
                readContent = r.read();
            }
            r.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
