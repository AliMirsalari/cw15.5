package org.example.repository.imp;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InMemoryStudentRepositoryTest {

    private StudentRepository underTest;

    @BeforeEach
    void setUp() {
        underTest = new InMemoryStudentRepository();
    }

    @Test
    void itShouldLoadAllStudents() {
        var actual = underTest.loadAll();
        assertThat(actual).isNotEmpty();
    }
}