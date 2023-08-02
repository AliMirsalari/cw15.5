package org.example.service;

import org.example.dto.StudentLoadAllResponseDto;

import java.util.List;

public interface StudentService {
    List<StudentLoadAllResponseDto> loadAll();
}
