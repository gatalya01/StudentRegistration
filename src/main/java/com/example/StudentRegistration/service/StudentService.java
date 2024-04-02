package com.example.StudentRegistration.service;

import com.example.StudentRegistration.dto.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    void addStudent(String firstName, String lastName, int age);
    void removeStudent(UUID id);
    List<Student> getAllStudents();
    void clearStudents();
}