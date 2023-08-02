package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.StudentLoadAllResponseDto;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;

import java.util.List;
@RequiredArgsConstructor
//It makes a constructor for all final arguments that are not defined

public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    @Override
    public List<StudentLoadAllResponseDto> loadAll() {
        return repository.loadAll()
                .stream()
                .map(student -> new StudentLoadAllResponseDto(student.getName(), student.getUniversityName()))
                .toList();

    }
}
