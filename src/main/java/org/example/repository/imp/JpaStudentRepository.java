package org.example.repository.imp;

import org.example.model.Student;
import org.example.model.impl.StudentModel;
import org.example.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


public class JpaStudentRepository implements StudentRepository {
   private static final EntityManager entityManager = Persistence.createEntityManagerFactory("default")
            .createEntityManager();
    @Override
    public List<Student> loadAll() {
        TypedQuery<StudentModel> query = entityManager.createQuery("FROM StudentModel", StudentModel.class);
        return query.getResultList()
                .stream()
                .map(student -> (Student) student)
                .toList();
    }
}
