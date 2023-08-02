package org.example;

import org.example.repository.imp.JpaStudentRepository;
import org.example.service.StudentService;
import org.example.service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl(new JpaStudentRepository());
        System.out.println(studentService.loadAll());
    }
}