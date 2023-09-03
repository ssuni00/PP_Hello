package org.example;

public class Student {
    private String hno;
    private String name;

    public Student (){

    }

    public Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "hno='" + hno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
