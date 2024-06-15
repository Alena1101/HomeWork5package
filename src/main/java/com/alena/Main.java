package com.alena;

import com.alena.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Ivan", "Makarov", "Petrovich");
        controller.createStudent("Maria", "Ivanova", "Vasil'evna");
        controller.createStudent("Bogdan", "Filatov", "Kazimirovich");
        controller.createStudent("Elizaveta", "Hilko", "Teofil'evna");
        controller.getAllStudents();
        System.out.println("---------------");
        controller.getAllTeachers();
        System.out.println("---------------");
        controller.createStudyGroup();

    }
}