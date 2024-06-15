package com.alena.service;

import com.alena.model.Student;
import com.alena.model.Teacher;
import com.alena.model.Type;
import com.alena.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList = new ArrayList<>();
    public void create(String firstName, String lastName, String middleName, Type type){
        long id = getFreeId(type);
        if (type == Type.STUDENT){
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }
        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }

    }

    public List<User> getAllUsers() {
        return userList;
    }
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                list.add((Student) user);
            }
        }
        return list;
    }
    public List<Teacher> getAllTeachers() {
        List<Teacher> list = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Teacher){
                list.add((Teacher) user);
            }
        }
        return list;
    }

    public User getUserById(Type type, long id){
        boolean isStudent = type == Type.STUDENT;
        User currentUser = null ;
        for (User user: userList){
            if (user instanceof Teacher && !isStudent && ((Teacher) user).getTeacherId()==id){
                currentUser = user;
            }
            if (user instanceof Student && isStudent &&  ((Student) user).getStudentId()==id){
                currentUser = user;
            }
        }
        return currentUser;

    }
    private long getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        long lastId = 1;
        for (User user: userList){
            if (user instanceof Teacher && !isStudent ){
                lastId = ((Teacher) user).getTeacherId()+1;
            }
            if (user instanceof Student && isStudent){
                lastId = ((Student) user).getStudentId()+1;
            }
        }
        return lastId;
    }

}
