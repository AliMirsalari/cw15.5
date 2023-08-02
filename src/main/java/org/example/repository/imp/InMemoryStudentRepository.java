package org.example.repository.imp;

import org.example.model.Student;
import org.example.model.impl.SimpleStudent;
import org.example.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;


public class InMemoryStudentRepository implements StudentRepository {
    @Override
    public List<Student> loadAll() {
        return List.of(new SimpleStudent());
    }

}
