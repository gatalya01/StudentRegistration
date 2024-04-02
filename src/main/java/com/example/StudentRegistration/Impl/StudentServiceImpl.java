package com.example.StudentRegistration.Impl;

import com.example.StudentRegistration.dto.Student;
import com.example.StudentRegistration.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {
    private final Map<UUID, Student> students = new HashMap<>();

    @Override
    public void addStudent(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age);
        students.put(student.getId(), student);
        System.out.println("Студент добавлен: " + student);
    }

    @Override
    public void removeStudent(UUID id) {
        Student student = students.remove(id);
        if (student != null) {
            System.out.println("Студент удален: " + student.getId());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void clearStudents() {
        students.clear();
        System.out.println("Список студентов очищен");
    }
}