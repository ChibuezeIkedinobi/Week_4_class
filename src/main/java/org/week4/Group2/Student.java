package org.week4.Group2;

public class Student {

    private int admissionNumber;
    private String firstName;
    private String lastName;
    private String dOB;
    private String gender;
    private int age;

    public Student(int admissionNumber, String firstName, String lastName, String dOB, String gender, int age) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dOB;
        this.gender = gender;
        this.age = age;
    }

    public Student() {

    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getdOB() {
        return dOB;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "AdmissionNumber: " + admissionNumber +
                ", Age: " + age +
                ", DOB: " + dOB +
                ", firstName: " + firstName +
                ", gender: " + gender +
                ", lastName: " + lastName+ "\n";

    }
}
