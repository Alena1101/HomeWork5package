package com.alena.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudyGroup{");
        sb.append("teacher=").append(teacher);
        sb.append(", studentList=").append(studentList);
        sb.append('}');
        return sb.toString();
    }

    private final Teacher teacher;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    private final List<Student> studentList ;
}
