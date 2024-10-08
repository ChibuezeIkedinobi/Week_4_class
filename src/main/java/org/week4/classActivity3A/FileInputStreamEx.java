package org.week4.classActivity3A;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileInputStream fs = new FileInputStream(desktopPath + "/output1.csv");
            int data;

            while ((data = fs.read()) != -1) {
                System.out.print((char) data);
            }
            fs.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
