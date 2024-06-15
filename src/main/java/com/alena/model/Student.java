package com.alena.model;

public class Student extends User{
    private long studentId;

    public Student(String firstName, String lastName, String middleName, Long studentId) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("studentId=").append(studentId);
        sb.append('}');
        return sb.toString();
    }
}
