package org.example.model.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.Student;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SimpleStudent implements Student {
    private String name;
    private String universityName;

}
