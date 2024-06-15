package com.alena.controller;

import com.alena.model.Student;
import com.alena.model.StudyGroup;
import com.alena.model.Teacher;
import com.alena.model.Type;
import com.alena.service.DataService;
import com.alena.service.StudyGroupService;
import com.alena.view.StudentView;
import com.alena.view.StudyGroupView;
import com.alena.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    public void createStudent(String firstName, String lastName, String middleName){
        dataService.create(firstName, lastName, middleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        dataService.create(firstName, lastName, middleName, Type.TEACHER);
    }
    public void getAllStudents(){
        List<Student> list = dataService.getAllStudents();
        for (Student student: list){
            studentView.printOnConsole(student);
        }

    }
    public void getAllTeachers(){
        List<Teacher> list = dataService.getAllTeachers();
        for (Teacher teacher: list){
            teacherView.printOnConsole(teacher);
        }

    }
    public void createStudyGroup(){
        StudyGroup studyGroup = studyGroupService.createStudyGroup(
                (Teacher) dataService.getUserById(Type.TEACHER,1),
                dataService.getAllStudents()
        );
        studyGroupView.printOnConsole(studyGroup);
    }

}

