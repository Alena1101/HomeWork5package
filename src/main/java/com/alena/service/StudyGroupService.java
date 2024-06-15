package com.alena.service;

import com.alena.model.Student;
import com.alena.model.StudyGroup;
import com.alena.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> list){
        return new StudyGroup(teacher, list);
    }
}
