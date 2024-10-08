package org.week4.Group2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];  // creating an fixed array of student object with 5

        students[0] = new Student(1001, "Emmanuel", "Noheem", "5th October", "M", 50);
        students[1] = new Student(1002, "Ikedinobi", "Chibueze", "3rd March", "M", 12);
        students[2] = new Student(1003, "Akani", "Ndamzi", "15th April", "M", 22);
        students[3] = new Student(1004, "Samuel", "Simon", "12th April", "M", 35);
        students[4] = new Student(1005, "Osiki", "Segun", "28th November", "M", 75);

        String desktopPath = System.getProperty("user.home") + "/Desktop";



        try {
            Writer file = new FileWriter(desktopPath + "/Student.csv");

            for (Student student : students) {
                file.write(student.toString());
            }
            file.close();
            System.out.println("Student Data has been written into the csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream out = new FileOutputStream(desktopPath + "/student2.csv");
            for (Student student : students) {
                byte[] bytes = student.toString().getBytes();
                out.write(bytes);
            }
            out.close();
            System.out.println("Student Data has been written into the csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
