package org.example.service.impl;

import org.example.dto.StudentLoadAllResponseDto;
import org.example.model.Student;
import org.example.model.impl.SimpleStudent;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    private StudentService underTest;
    @Mock
    private StudentRepository repository;

    @BeforeEach

    void setUp() {
        underTest = new StudentServiceImpl(repository);
    }
    @Test
    void test() {
//        preparation
        List <Student> studentList = List.of(
                new SimpleStudent("Ahmad","Tehran"),
                new SimpleStudent("Reza","Sharif")
        );
        given(repository.loadAll())
                .willReturn(studentList);
        var actual = underTest.loadAll();
        assertThat(actual).hasSize(studentList.size());
        assertThat(actual).extracting(StudentLoadAllResponseDto::name)
                .asList()
                .allMatch(name -> studentList.stream().anyMatch(student -> student.getName().equals(name)));
    }
}