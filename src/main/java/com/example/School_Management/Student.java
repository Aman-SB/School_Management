package com.example.School_Management;

public class Student {

    private int admission_no ;

    private String name;

    private int roll_no;

    public Student() {
    }

    public Student(int admission_no, String name, int roll_no) {
        this.admission_no = admission_no;
        this.name = name;
        this.roll_no = roll_no;
    }

    public int getAdmission_no() {
        return admission_no;
    }

    public void setAdmission_no(int admission_no) {
        this.admission_no = admission_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admission_no=" + admission_no +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}

