package com.alena.model;

public class Teacher extends User{
    private long teacherId;

    public Teacher(String firstName, String lastName, String middleName, long teacherId) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teacher{");
        sb.append("teacherId=").append(teacherId);
        sb.append('}');
        return sb.toString();
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
