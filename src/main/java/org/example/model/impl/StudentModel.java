package org.example.model.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.model.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
@IdClass(StudentModel.StudentId.class)
public class StudentModel implements Student {


    @Id
    private String name;
    @Id
    private String universityName;

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class StudentId implements Serializable {
        private String name;
        private String universityName;
    }
}
