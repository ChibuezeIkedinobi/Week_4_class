package org.week4.classActivity3A;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileOutputStream out = new FileOutputStream(desktopPath + "/output1.csv");
            String wr = "I am learning how to write into a file using file output stream class";  //convert this stream into a byte
            byte[] bytes = wr.getBytes();                      // get byte and save it into the byte array

            out.write(bytes);
            out.close();
            System.out.println("Successfully written into a file");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
