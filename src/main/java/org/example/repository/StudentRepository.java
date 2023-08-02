package org.example.repository;

import org.example.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> loadAll();
}
